import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Creer des personnes
        Personne personne1 = new Personne("Tissir", "Ayman", LocalDate.of(2002, 10, 21), "tissir@example.com", 123456789, "aymanTsr");
        Personne personne2 = new Personne("Anas", "Ayman", LocalDate.now(), "anasAyman@example.com", 987654321, "anasAyman");  // Today is her birthday
        Personne personne3 = new Personne("Fareh", "Abdallah", LocalDate.of(1990, 10, 11), "fareh@example.com", 987654321, "APuUD");  // Today is her birthday

        //Creer calendrier vide
        Calendrier calendrier = new Calendrier(new ArrayList<>());
        //ajouter des personnes au calendrier
        calendrier.add(personne1);
        calendrier.add(personne2);
        calendrier.add(personne3);


        // Tester l'envoi des messages
        calendrier.envoyerMessagesAnniversaire();
    }
}
