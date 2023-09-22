package persistencia;

import java.sql.Connection;
import entidades.Materia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MateriaData {

    private Connection con = null;

    public MateriaData() {

        con = Conexion.getConexion();
    }

    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO materia (nombre, anio, estado)"
                + "VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia guardada exitosamente.");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar ingresara la"
                    + "tabla materia");
        }

    }

    public Materia buscarMateria(int id) {

        String sql = "SELECT nombre, anio, estado FROM Materia WHERE idMateria=?";

        Materia materia = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery(sql);

            if (rs.next()) {

                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setActivo(rs.getBoolean("estado"));

            } else {

                JOptionPane.showMessageDialog(null, "No se encontró ninguna materia con ese id");
            }

            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materia;
    }

    public void modificarMateria(Materia materia) {

        String sql = "UPDATE materia SET nombre=?, anio=?, estado=? "
                + "WHERE idMateria=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isActivo());
            int exito = ps.executeUpdate();
            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Materia modificada exitosamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna materia con ese id");
        }

    }

    public void eliminarMateria(int idMateria) {

        String sql = "UPDATE materia SET estado=0 WHERE idMateria=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia eliminada exitosamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna materia con ese id");
        }
    }

    public List<Materia> listarMaterias() {
        Materia materia=null;
        String sql = "SELECT * FROM materia";
       List<Materia> listaMaterias = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {

                materia = new Materia();
                materia.setIdMateria(rs.getInt("id Materia"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setActivo(rs.getBoolean("estado"));

                listaMaterias.add(materia);

                ps.close();

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
        }

        return listaMaterias;

    }
 public List<Materia> listarMateriasPorEstado(boolean estado) {
        Materia materia=null;
        String sql = "SELECT * FROM materia WHERE estado = ?";
        List<Materia> listaMateriasPorEstado = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {

                materia = new Materia();
                materia.setIdMateria(rs.getInt("id Materia"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setActivo(rs.getBoolean("estado"));

                listaMateriasPorEstado.add(materia);

                ps.close();

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
        }

        return listaMateriasPorEstado;

    }
}
