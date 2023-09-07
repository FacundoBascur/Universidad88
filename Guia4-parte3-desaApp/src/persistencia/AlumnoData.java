package persistencia;

import java.sql.Connection;
import vistas.*;
import entidades.*;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class AlumnoData {

    private Connection con = null;

    public AlumnoData(Conexion conexion) {
        this.con = conexion.buscarConexion();
    }

    public void guardarAlumno(Alumno alum) {

        String sql = "INSERT INTO alumno(dni,apellido,nombre,fechaNacimiento,estado)VALUES(?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //Statement.RETURN_GENERATED_KEYS este se utiliza cunaod quiero recuperar el id que genero autoimaticamente la base de datos, si no la necesito uso solo con.prepareStatement(query); ya basta
            ps.setInt(1, alum.getDni());
            ps.setString(2, alum.getApellido());
            ps.setString(3, alum.getNombre());
            ps.setDate(4, Date.valueOf(alum.getFechaNacimiento()));
            ps.setBoolean(5, alum.isEstado());
            ps.executeUpdate();  //aca ejecuto la consulta realizada

            JOptionPane.showMessageDialog(null, "Alumno guardado con exito");

            //Recupero el dato de id y asigno. esta parte si nosotros le colocamos el id no es necesaria pero como la base de atos la genera automaticamente si lo es.
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) { // si exite algo en el resul set, entonces setealo 
                alum.setId(rs.getInt(1));

                ps.close(); // aca cierro el statement
                JOptionPane.showMessageDialog(null, "Guardado");

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo obtener el id");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }

    }

    public Alumno buscarAlumno(int dni) { //solamente va a mostrar a uno

        Alumno alum = null;

        String sql = "SELECT * FROM alumno WHERE dni = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery(); // executeQuery se utiliza en el select y para el insert y update se usa el executeUpdate

            while (rs.next()) { //armo el objeto

                alum = new Alumno();
                alum.setId(rs.getInt("idAlumno"));
                alum.setDni(rs.getInt("dni"));
                alum.setApellido(rs.getString("apellido"));
                alum.setNombre(rs.getString("nombre"));
                alum.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alum.setEstado(rs.getBoolean("estado"));

            }
            //System.out.println(alum.toString());
            ps.close(); //finalizo 

        } catch (SQLException e) {
            System.out.println("Error");
        }

        return alum;
    }

    public List<Alumno> buscarAlumnosPorCalificacion(int nota) {
        Alumno alum = null;
        List<Alumno> alumnos = new ArrayList<>();

        String sql = "SELECT * FROM alumno AS a INNER JOIN Inscripcion AS i on a.idAlumno = i.idAlumno WHERE i.nota < ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nota);
            ResultSet rs = ps.executeQuery(); // executeQuery se utiliza en el select y para el insert y update se usa el executeUpdate

            while (rs.next()) { //armo el objeto

                alum = new Alumno();
                alum.setId(rs.getInt("idAlumno"));
                alum.setDni(rs.getInt("dni"));
                alum.setApellido(rs.getString("apellido"));
                alum.setNombre(rs.getString("nombre"));
                alum.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alum.setEstado(rs.getBoolean("estado"));
                alumnos.add(alum);

            }
            //System.out.println(alum.toString());
            ps.close(); //finalizo 

        } catch (SQLException  e) {
            System.out.println("Error");
        }

        return alumnos;

    }

    public List<Alumno> listarAlumnos() {

        Alumno alum = null;

        List<Alumno> alumnos = new ArrayList<>();

        String sql = "SELECT * FROM alumno";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); // executeQuery se utiliza en el select y para el insert y update se usa el executeUpdate

            while (rs.next()) { //armo el objeto

                alum = new Alumno();
                alum.setId(rs.getInt("idAlumno"));
                alum.setDni(rs.getInt("dni"));
                alum.setApellido(rs.getString("apellido"));
                alum.setNombre(rs.getString("nombre"));
                alum.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alum.setEstado(rs.getBoolean("estado"));
                alumnos.add(alum);
            }

            ps.close(); //finalizo 

        } catch (SQLException e) {
            System.out.println("Error");
        }

        return alumnos;

    }

    public void eliminarAlumno(int dni) {

        Alumno alum = null;
        String sql = "DELETE FROM alumno WHERE dni = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int conf = ps.executeUpdate();

            if (conf > 0) {
                JOptionPane.showMessageDialog(null, "Se elimino el alumno con exito");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el alumno seleccionado");

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
