package persistencia;

import entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MateriaData {

    private Connection con = null;

    public MateriaData(Conexion conexion) {
        this.con = conexion.buscarConexion();
    }

    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO materia (nombre,anio,estado) VALUES (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombreM());
            ps.setInt(2, materia.getAnioM());
            ps.setBoolean(3, materia.isEstadoM());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Materia guardada");

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) { // si exite algo en el resul set, entonces setealo 
                materia.setId(rs.getInt(1));
                ps.close(); // aca cierro el statement
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo obtener el id");

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }

    }

}
