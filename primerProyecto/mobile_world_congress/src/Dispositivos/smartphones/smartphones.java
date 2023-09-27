package Dispositivos.smartphones;

import Dispositivos.Dispositivos;

public class smartphones extends Dispositivos {
    private String sistemaOperatiu;
    private boolean acelerometre;
    private boolean gps;


    public smartphones(String marca, String modelo, int precioBase, String sistemaOperatiu, boolean acelerometre,
            boolean gps) {
        super(marca, modelo, precioBase);
        this.sistemaOperatiu = sistemaOperatiu;
        this.acelerometre = acelerometre;
        this.gps = gps;
    }

    public String getSistemaOperatiu() {
        return sistemaOperatiu;
    }

    public void setSistemaOperatiu(String sistemaOperatiu) {
        this.sistemaOperatiu = sistemaOperatiu;
    }

    public boolean isAcelerometre() {
        return acelerometre;
    }

    public void setAcelerometre(boolean acelerometre) {
        this.acelerometre = acelerometre;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Smartphone [ marca= " + marca + "  modelo= " + modelo + "  precioBase= " + precioBase + "  SistemaOperativo= " + sistemaOperatiu + "  Acelerometre= " + acelerometre + " ]";
    }

    
    
}
