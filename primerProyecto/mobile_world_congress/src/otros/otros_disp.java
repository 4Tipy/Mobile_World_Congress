package otros;

public class otros_disp{

    private String descripcion;

    //Controlador

    public otros_disp(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getters y Setters
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Otros Dispositivos descripcion=" + descripcion + ".";
    }
    

    
}