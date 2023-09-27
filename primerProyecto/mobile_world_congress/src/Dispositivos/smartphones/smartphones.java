package Dispositivos.smartphones;
import Dispositivos.Dispositivos;

public class smartphones {
    private String sistemaOperatiu;
    private boolean acelerometre;
    private boolean gps;

    public smartphones(String sistemaOperatiu, boolean acelerometre, boolean gps) {
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
        return "smartphones [sistemaOperatiu=" + sistemaOperatiu + ", acelerometre=" + acelerometre + ", gps=" + gps
                + "]";
    }
    
}
