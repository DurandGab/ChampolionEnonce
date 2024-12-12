package champollion;

public class UE {
    private final String myIntitule;
    private double heuresCM;
    private double heuresTD;
    private double heuresTP;

    public UE(String intitule) {
        myIntitule = intitule;
        this.heuresCM = heuresCM;
        this.heuresTD = heuresTD;
        this.heuresTP = heuresTP;
    }

    public String getIntitule() {
        return myIntitule;
    }

    public double getHeuresCM() {
        return heuresCM;
    }

    public double getHeuresTD() {
        return heuresTD;
    }

    public double getHeuresTP() {
        return heuresTP;
    }

    public void ajouterHeuresPourUE(UE ue, double heuresCM, double heuresTD, double heuresTP) {
        this.heuresCM += heuresCM;
        this.heuresTD += heuresTD;
        this.heuresTP += heuresTP;
    }

}
