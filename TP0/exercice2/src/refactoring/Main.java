package refactoring;

public class Main {
    public static void main(String[] args) {
        GestionDesOperations gestionnaire = new GestionDesOperations();

        // Création d'un compte courant
        Compte compteCourant = new Compte("10", "01/01/2020", TypeCompte.Courant);
        gestionnaire.effectuerOperation(compteCourant, new Operation(2000, TypeOperation.Debit));
        gestionnaire.effectuerOperation(compteCourant, new Operation(1000, TypeOperation.Credit));
        System.out.println("Solde Compte Courant : " + compteCourant.getMontant());

        // Création d'un compte épargne
        Compte compteEpargne = new Compte("11", "01/01/2021", TypeCompte.Epargne);
        gestionnaire.effectuerOperation(compteEpargne, new Operation(10000, TypeOperation.Debit));
        gestionnaire.effectuerOperation(compteEpargne, new Operation(5500, TypeOperation.Credit));
        System.out.println("Solde Compte Epargne : " + compteEpargne.getMontant());
    }
}
