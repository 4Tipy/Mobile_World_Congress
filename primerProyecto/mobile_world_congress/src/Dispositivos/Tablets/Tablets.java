package Tablets;
import Dispositivos.Dispositivos;

public class Tablets extends Dispositivos {
    private int nombrePolsades;

    public Tablets(String marca, String modelo, int precioBase, int nombrePolsades) {
        super(marca, modelo, precioBase);
        this.nombrePolsades = nombrePolsades;
    }

    public int getNombrePolsades() {
        return nombrePolsades;
    }

    public void setNombrePolsades(int nombrePolsades) {
        this.nombrePolsades = nombrePolsades;
    }

    @Override
    public String toString() {
        return "Tablets [nombrePolsades=" + nombrePolsades + "]";
    }
    
}