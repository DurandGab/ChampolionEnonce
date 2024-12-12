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


}

