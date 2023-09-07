
package entidades;


public class Materia {
    
    private int id = -1; 
    private String nombreM;
    private int anioM;
    private boolean estadoM;

    public Materia(int id,String nombreM, int anioM, boolean estadoM) {
        this.id = id;
        this.nombreM = nombreM;
        this.anioM = anioM;
        this.estadoM = estadoM;
    }

    public Materia(String nombreM, int anioM, boolean estadoM) {
        this.id = -1;
        this.nombreM = nombreM;
        this.anioM = anioM;
        this.estadoM = estadoM;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public int getAnioM() {
        return anioM;
    }

    public void setAnioM(int anioM) {
        this.anioM = anioM;
    }

    public boolean isEstadoM() {
        return estadoM;
    }

    public void setEstadoM(boolean estadoM) {
        this.estadoM = estadoM;
    }

    @Override
    public String toString() {
        return "Materia id = " + id + " \nNombreM = " + nombreM + "\nAño =" + anioM + "\nEstado = " + estadoM;
    }
    
    
    
    
    
    
}
