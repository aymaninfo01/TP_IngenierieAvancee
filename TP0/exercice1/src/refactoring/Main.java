package refactoring;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Set the VAT rate
        CalculeDePrix.setTVA(0.2); // 20% VAT

        // Create some products
        Produit produit1 = new Produit();
        produit1.setLibele("Produit A");
        produit1.setPrix(100.0);

        Produit produit2 = new Produit();
        produit2.setLibele("Produit B");
        produit2.setPrix(200.0);

        // Create an invoice
        Facture facture = new Facture(1);
        facture.addProduit(produit1, 2); // 2 units of Produit A
        facture.addProduit(produit2, 1); // 1 unit of Produit B

        // Print the invoice
        FactureImpression factureImpression = new FactureImpression();
        factureImpression.imprimer(facture);

        // Save the invoice to a file
        FactureSauveguard factureSauveguard = new FactureSauveguard();
        factureSauveguard.saveFacture(facture);
    }
}
