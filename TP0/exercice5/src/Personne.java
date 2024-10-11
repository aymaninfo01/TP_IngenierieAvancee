import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Personne implements IContract {
    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;
    private String email;
    private int telephoneMobile;
    private String pseudo;


    //constructeur
    public Personne() {
    }

    public Personne(String nom, String prenom, LocalDate dateDeNaissance, String email, int telephoneMobile, String pseudo) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.email = email;
        this.telephoneMobile = telephoneMobile;
        this.pseudo = pseudo;
    }

    //getters and setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephoneMobile() {
        return telephoneMobile;
    }

    public void setTelephoneMobile(int telephoneMobile) {
        this.telephoneMobile = telephoneMobile;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    //Affichage d'une Personne
    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                ", email='" + email + '\'' +
                ", telephoneMobile=" + telephoneMobile +
                ", pseudo=" + pseudo +
                '}';
    }


    // Methodes
    public boolean envoyerEmail(String message, List<String> destinataires) {
        System.out.println("Envoi d'email a " + destinataires + ": " + message);
        return true;
    }

    public boolean envoyerSMS(String message, int telephone) {
        System.out.println("Envoi de SMS au numero " + telephone + ": " + message);
        return true;
    }

    @Override
    public int calculerAge() {
        if (dateDeNaissance == null) {
            return 0;
        }
        return Period.between(dateDeNaissance, LocalDate.now()).getYears();
    }
    @Override
    public boolean envoyerMessage(String message) {
            if (this.getDateDeNaissance().getMonth().equals(LocalDate.now().getMonth()) && (this.getDateDeNaissance().getDayOfMonth() == LocalDate.now().getDayOfMonth())) {
                System.out.println("Envoi de message a " + this.getNom() + ": " + message + " " + this.getNom() + "!");
            }
        return true;
    }

}

