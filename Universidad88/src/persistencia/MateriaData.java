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

    public Materia buscarMateria(Integer id) {

        String sql = "SELECT nombre, anio, estado FROM materia WHERE idMateria=?";

        Materia materia = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setActivo(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe ninguna materia con el Id ingresado.");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión con la base de datos.");
        }
        return materia;
    }

    public void modificarMateria(int id, String nombre, int anio) {
 Materia materia=null;
        String sql = "UPDATE materia SET nombre=?, anio=? WHERE idMateria=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
             ps.setString(1, nombre);
            ps.setInt(2, anio);
            ps.setInt(3, id);
           
           

     int resul=ps.executeUpdate();
     if(resul==1){
            
          JOptionPane.showMessageDialog(null, "Materia modificada exitosamente.");
            }
      
        }  catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos.");
                
       
        }
 
    
    }
    public void bajaMateria(int id) {

        String sql = "UPDATE materia SET estado=0 WHERE idMateria=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int exito = ps.executeUpdate();
            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "La materia cambió su estado a: INACTIVO.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna materia con ese Id.");
        }
    }

    public void altaMateria(int id) {

        String sql = "UPDATE materia SET estado=1 WHERE idMateria=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int exito = ps.executeUpdate();
            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "La materia cambió su estado a: ACTIVO.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna materia con ese Id");
        }
    }

    public List<Materia> listarMaterias() {
        Materia materia = null;

        List<Materia> listaMaterias = new ArrayList<>();

        try {
            String sql = "SELECT * FROM materia";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
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

    
}
