package champollion;

import java.util.ArrayList;

public class ServicePrevu {
	// TODO : implémenter cette classe
    private int volumeCM;
    private int volumeTD;
    private int volumeTP;
    private ArrayList<UE> ue;
    private Enseignant enseignant;

    public ServicePrevu() {
        this.volumeCM = 0;
        this.volumeTD = 0;
        this.volumeTP = 0;
        this.ue = new ArrayList<>();
    }

    public int getVolumeCM() {
        return volumeCM;
    }

    public int getVolumeTD() {
        return volumeTD;
    }

    public int getVolumeTP() {
        return volumeTP;
    }

    public UE getUE(UE ue) {
        for (UE u : this.ue) {
            if (u.equals(ue)) {
                return u;
            }
        }
        return ue;
    }

    public String toString() {
        return "Service prévu pour l'enseignant " + enseignant.getNom() + " pour l'UE " + ue + " : " + volumeCM;
    }
}
