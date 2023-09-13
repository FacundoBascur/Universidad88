package persistencia;

import entidades.Inscripcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class InscripcionData {
    
    private Connection con = null; 
    
    public InscripcionData () {
        this.con=Conexion.getConexion();
    }
    
    public void guardarInscripcion (Inscripcion insc) {
        
        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()) {
                insc.se(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "La inscripción se realizó de manera correcta.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla Inscripción. Vuelva a intentar, por favor.");
        }
    }
}