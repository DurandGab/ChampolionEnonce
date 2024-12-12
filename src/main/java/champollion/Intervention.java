package champollion;

import java.util.Date;

public class Intervention {
    private Date date;
    private int duree;
    private boolean anulle;
    private int heureDebut;
    private TypeIntervention type;
    private Salle salle;
    private UE ue;

    public Intervention(Date date, int duree, TypeIntervention type, Salle salle, UE ue) {
        this.date = date;
        this.duree = duree;
        this.type = type;
        this.salle = salle;
        this.ue = ue;
    }

    public Date getDate() {
        return date;
    }

    public int getDuree() {
        return duree;
    }

    public boolean isAnulle() {
        return anulle;
    }

    public int getHeureDebut() {
        return heureDebut;
    }

    public TypeIntervention getType() {
        return type;
    }

    public Salle getSalle() {
        return salle;
    }

    public UE getUe() {
        return ue;
    }

    public void setAnulle(boolean anulle) {
        this.anulle = anulle;
    }

    public void setHeureDebut(int heureDebut) {
        this.heureDebut = heureDebut;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public void setUe(UE ue) {
        this.ue = ue;
    }

}

