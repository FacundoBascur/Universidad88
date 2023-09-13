package entidades;

public class Inscripcion {

    private int idInscripcion;
    private Alumno alumno; 
    private Materia materia;
    private int nota; 

    public Inscripcion() {
    }

    public Inscripcion(int idInscripcion, Alumno alumno, Materia materia, int nota) {
        this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion(Alumno alumno, Materia materia, int nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public int getInscripcion() {
        return idInscripcion;
    }

    public void setInscripcion(int inscripcion) {
        this.idInscripcion = inscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "inscripcion=" + idInscripcion + ", alumno=" + alumno + ", materia=" + materia + ", nota=" + nota + '}';
    }

   // public void setiDInscripto(int aInt) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    
}
