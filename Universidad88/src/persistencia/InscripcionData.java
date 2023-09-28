package persistencia;

import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InscripcionData {

    // conexión y atributos
    private Connection con = null;
    private MateriaData mateData = new MateriaData();
    private AlumnoData alumData = new AlumnoData();

    public InscripcionData() {
        con = Conexion.getConexion();
    }
    
    // recibe una inscripción por parametro y la almacena en la entidad inscripcion
    public void guardarInscripcion(Inscripcion insc) {

        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                insc.setidInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "La inscripción se realizó de manera correcta.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla Inscripción. Vuelva a intentar, por favor.");
        }
    }
    
    // método usado en el formulario de vista de manipulación de notas
    public void modificarNota(int idAlumno, int idMateria, double nota) {

        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "La nota fue actualizada correctamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla Inscripción. Vuelva a intentar, por favor.");
        }
    }

    // usado en formularioInscripcion2, para borrar una fila completa, todas las inscripciones que NO estén borradas, están ACTIVAS
    public void borrarInscripcion(int idAlumno, int idMateria) {

        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? and idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "La inscripción fue eliminada correctamente.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla Inscripción. Vuelva a intentar, por favor.");
        }
    }

    // retorna una lista con TODAS las inscripciones. Recordamos que no es necesario destacar el estado "activo = 1", porque los mismos son los que NO fueron eliminados por el método borrarInscripcion
    public List<Inscripcion> averiguarInscriptos() {
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setidInscripcion(rs.getInt("idInscripto"));
                Alumno alum = alumData.buscarPorId(rs.getInt("idAlumno"));
                Materia mate = mateData.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alum);
                insc.setMateria(mate);
                insc.setNota(rs.getInt("nota"));
                cursadas.add(insc);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder al registro de Inscripción");
        }

        return cursadas;
    }
    
    // principal diferencia con método averiguarInscriptos: WHERE en la consulta SQL, con parámetro comodín para traer inscripción a través del ID del alumno
    public List<Inscripcion> averiguarInscriptosPorIdAlumno(int idAlumno) {
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setidInscripcion(rs.getInt("idInscripcion"));
                Alumno alum = alumData.buscarPorId(rs.getInt("idAlumno"));
                Materia mate = mateData.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alum);
                insc.setMateria(mate);
                insc.setNota((double) rs.getDouble("nota"));
                cursadas.add(insc);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder al registro de Inscripción");
        }

        return cursadas;
    }
    
    // muestra lista de materias en las que un alumno está inscripto a través de su ID (parámetro comodin) y usando AND para unir entidades inscripcion + materia
    public List<Materia> averiguarMateriasInscriptas(int idAlumno) {

        ArrayList<Materia> materias = new ArrayList<>();
        String sql = "SELECT inscripcion.idMateria, nombre, anio FROM inscripcion, materia WHERE inscripcion.idMateria = materia.idMateria AND inscripcion.idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder al registro de inscripciones");
        }

        return materias;
    }
    
    // muestra lista de materias activas y que NO figuren como cursadas en entidad Inscripcion
    public List<Materia> averiguarMateriasNoInscriptas(int idAlumno) {
        ArrayList<Materia> materias = new ArrayList<>();

        String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder al registro de inscripciones");
        }
        return materias;
    }
    
    // devuelve lista de alumnos pasando ID por parámetro (consulta SQL incluye true en activo)
    public List<Alumno> averiguarAlumnosPorMateria(int idMateria) {
       
        ArrayList<Alumno> alumnosMate = new ArrayList<>();

        String sql = "SELECT a.idAlumno, a.dni, a.apellido, a.nombre  "
                + "FROM inscripcion i, alumno a "
                + "WHERE i.idAlumno = a.idAlumno AND idMateria = ? AND a.estado = 1";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
               
                alumnosMate.add(alumno);
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a ninguna de las entidades de la base de datos. Intente nuevamente, por favor");
        }

        return alumnosMate;
    }   
}