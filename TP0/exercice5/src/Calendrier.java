import java.util.List;

public class Calendrier {
    private List<IContract> destinataires;

    public Calendrier() {
    }

    public Calendrier(List<IContract> personnes) {
        this.destinataires = personnes;
    }

    public void add(IContract destinataire) {
        this.destinataires.add(destinataire);
        System.out.println(destinataire.getClass().getSimpleName() + " Ajoute au calendrier");
    }

    public void envoyerMessagesAnniversaire() {
        String message = "Joyeux Anneversaire";
        for (IContract destinataire : destinataires) {
            destinataire.envoyerMessage(message); // Sends a birthday message
        }
    }

}
