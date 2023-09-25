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

    private Connection con = null;
    private MateriaData mateData = new MateriaData();
    private AlumnoData alumData = new AlumnoData();

    public InscripcionData() {
        this.con = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion insc) {

        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getNota());
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

    public void modificarNota(int idAlumno, int idMateria, double nota) {

        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? and idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idAlumno);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "La nota fue actualizada correctamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla Inscripción. Vuelva a intentar, por favor.");
        }
    }

    //para borrar una fila completa, todas las inscripciones que NO estén borradas, están ACTIVAS
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

    //recordamos que no es necesario destacar el estado "activo = 1", porque los mismos son los que no fueron eliminados por el método anterior
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

    public List<Inscripcion> averiguarInscriptosPorIdAlumno(int idAlumno) {
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setidInscripcion(rs.getInt("idInscripto"));
                Alumno alum = alumData.buscarPorId(rs.getInt("idAlumno"));
                Materia mate = mateData.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alum);
                insc.setMateria(mate);
                insc.setNota((int) rs.getDouble("nota"));
                cursadas.add(insc);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder al registro de Inscripción");
        }

        return cursadas;
    }

    public List<Materia> averiguarMateriasInscriptas(int idAlumno) {

        ArrayList<Materia> materias = new ArrayList<>();
        String sql = "SELECT inscripcion.idMateria, nombre, anio FROM inscripcion, materia WHERE inscripcion.idMateria = materia.idMateria AND inscripcion.idAlumno = ?;";
        try {
            PreparedStatement ps = con.prepareCall(sql);
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

    public List<Materia> averiguarMateriasNoInscriptas(int idAlumno) {
        ArrayList<Materia> materias = new ArrayList<>();

        String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria not in (SELECT id MAteria FROM inscripcion WHERE id Alumno = ?)";

        try {
            PreparedStatement ps = con.prepareCall(sql);
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

    public List<Alumno> averiguarAlumnosPorMateria(int idMateria) {

        ArrayList<Alumno> alumnosMate = new ArrayList<>();

        String sql = "SELECT a.idAlumno, dni, apellido, nombre, fechaNacimiento, estado FROM inscripcion i, alumno a WHERE i.idAlumno = a.idAlumno AND idMAteria = ? AND a.estado = 1";
        try {
            PreparedStatement ps = con.prepareCall(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
                alumnosMate.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a ninguna de las entidades de la base de datos. Intente nuevamente, por favor");
        }

        return alumnosMate;
    }
}