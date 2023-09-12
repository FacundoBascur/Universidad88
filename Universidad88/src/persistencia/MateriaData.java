
package persistencia;
import java.sql.Connection;
import entidades.Materia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class MateriaData {
    
    private Connection con=null;
    
    public MateriaData(){
    
    con=Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia){
        
        String sql="INSERT INTO materia (nombre, anio, estado)" 
                + "VALUES (?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, materia.getNombre());
        ps.setInt(2, materia.getAnio());
        ps.setBoolean(3, materia.isActivo());
        ps.executeUpdate();
        
        ResultSet rs=ps.getGeneratedKeys();
        
        if(rs.next()){
        
            materia.setIdMateria(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Materia guardada exitosamente.");
        
        }
        
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al intentar ingresara la"
                   + "tabla materia");
        }
    
        
      /*  public void buscarMateria(Materia id){
        }
    }*/
    
    
}
}
