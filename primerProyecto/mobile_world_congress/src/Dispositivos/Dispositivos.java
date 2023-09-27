package Dispositivos;

public class Dispositivos {
    private String marca;
    private String modelo;
    private int precioBase;

    public Dispositivos(String marca, String modelo, int precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Dispositivos [marca=" + marca + ", modelo=" + modelo + ", precioBase=" + precioBase + "]";
    }

}