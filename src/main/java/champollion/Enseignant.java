package champollion;

/**
 * Un enseignant est caractérisé par les informations suivantes : son nom, son adresse email, et son service prévu,
 * et son emploi du temps.
 */
public class Enseignant extends Personne {
    private ServicePrevu servicePrevu;
    // TODO : rajouter les autres méthodes présentes dans le diagramme UML

    public Enseignant(String nom, String email) {
        super(nom, email);
        this.servicePrevu = new ServicePrevu();
    }

    public ServicePrevu getServicePrevu() {
        return servicePrevu;
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant en "heures équivalent TD" Pour le calcul : 1 heure
     * de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure de TP vaut 0,75h
     * "équivalent TD"
     *
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevues() {
        // TODO: Implémenter cette méthode
        //throw new UnsupportedOperationException("Pas encore implémenté");
        double volumeCM = this.servicePrevu.getVolumeCM() * 1.5;
        double volumeTD = this.servicePrevu.getVolumeTD();
        double volumeTP = this.servicePrevu.getVolumeTP() * 0.75;
        return (int) Math.round(volumeCM + volumeTD + volumeTP);
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant dans l'UE spécifiée en "heures équivalent TD" Pour
     * le calcul : 1 heure de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure
     * de TP vaut 0,75h "équivalent TD"
     *
     * @param ue l'UE concernée
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevuesPourUE(UE ue) {
        double volumeCM = this.servicePrevu.getUE(ue).getHeuresCM() * 1.5;
        double volumeTD = this.servicePrevu.getUE(ue).getHeuresTD();
        double volumeTP = this.servicePrevu.getUE(ue).getHeuresTP() * 0.75;
        return (int) Math.round(volumeCM + volumeTD + volumeTP);
    }



    /**
     * Ajoute un enseignement au service prévu pour cet enseignant
     *
     * @param ue l'UE concernée
     * @param volumeCM le volume d'heures de cours magistral
     * @param volumeTD le volume d'heures de TD
     * @param volumeTP le volume d'heures de TP
     */
    public void ajouteEnseignement(UE ue, int volumeCM, int volumeTD, int volumeTP) {
        // TODO: Implémenter cette méthode
        //throw new UnsupportedOperationException("Pas encore implémenté");
        UE u = this.servicePrevu.getUE(ue);
        double heuresCM = volumeCM * 1.5;
        double heuresTD = volumeTD * 1.0;
        double heuresTP = volumeTP * 0.75;
        double totalHeuresAjoutees = heuresCM + heuresTD + heuresTP;

        // Calculer les heures déjà prévues
        double heuresPrevues = heuresPrevuesPourUE(ue);

        // S'assurer que le total des heures ne dépasse pas le seuil permis
        if (heuresPrevues + totalHeuresAjoutees > 192) {
            throw new IllegalArgumentException("Le volume d'heures ajouté dépasse le maximum autorisé pour cette UE.");
        }

        // Ajouter les heures
        ue.ajouterHeuresPourUE(ue, volumeCM, volumeTD, volumeTP);
    }
    }
