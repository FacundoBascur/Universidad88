package entidades;

public class Inscripcion {

    private int idIns = -1;
    private int idAlumno;
    private int idMateria;
    private int nota;

    public Inscripcion(int idIns, int nota ,int idAlumno, int idMateria) {

        this.idIns = idIns;
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
        this.nota = nota;
    }

    public Inscripcion(int nota,int idAlumno,  int idMateria) {
        this.idIns = -1;
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
        this.nota = nota;
    }

    public Inscripcion() {
    }

    
    public int getIdIns() {
        return idIns;
    }

    public void setIdIns(int idIns) {
        this.idIns = idIns;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Inscripcion Id=" + idIns + "\nId Alumno = " + idAlumno + "\nId Materia =" + idMateria + "\nNota = " + nota ;
    }

    
    
    
}
