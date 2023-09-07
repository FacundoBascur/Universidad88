package persistencia;

import entidades.Inscripcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InscripcionData {

    private Connection con = null;

    public InscripcionData(Conexion conexion) {
        this.con = conexion.buscarConexion();

    }

    public  void realizarInscripcion(Inscripcion inscripcion) {

        try {
            String sql = "INSERT INTO inscripcion(nota,idAlumno,idMateria) VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inscripcion.getNota());
            ps.setInt(2, inscripcion.getIdAlumno());
            ps.setInt(3, inscripcion.getIdMateria());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "La inscripcion se realizo con exito");

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) { // si exite algo en el resul set, entonces setealo 
                inscripcion.setIdIns(rs.getInt(1));
                ps.close(); // aca cierro el statement
                
                
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo obtener el id");

            }

        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Inscripcion> listarInscripcion() {

        Inscripcion ins = null;
        List<Inscripcion> list = new ArrayList<>();

        String sql = "SELECT * FROM inscripcion";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) { //armo el objeto

                ins = new Inscripcion();
                ins.setIdIns(rs.getInt("idinscripto"));
                ins.setNota(rs.getInt("nota"));
                ins.setIdAlumno(rs.getInt("idAlumno"));
                ins.setIdMateria(rs.getInt("idMateria"));
                list.add(ins);
            }

            ps.close(); //finalizo 

        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return list;
    }

}
