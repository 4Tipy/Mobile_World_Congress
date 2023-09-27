package otros;
import Dispositivos.Dispositivos;

public class otros_disp extends Dispositivos {

    private String descripcion;

    //Contructor
        public otros_disp(String marca, String modelo, int precioBase, String descripcion) {
        super(marca, modelo, precioBase);
        this.descripcion = descripcion;
    }

    //Setters y Getter

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

     // To String

        @Override
        public String toString() {
            return "otros_disp descripcion=" + descripcion + ".";
        }

    
    

}