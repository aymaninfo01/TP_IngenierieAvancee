package refactoring;

import java.util.Map;

public class FactureImpression {

    public void imprimer(Facture facture){
        CalculeDePrix calculeDePrix = new CalculeDePrix();
        double prix;
        for (Map.Entry mapentry : facture.getProduits().entrySet()) {
            prix = ((Produit)mapentry.getKey()).getPrix() * ((Integer)mapentry.getValue());
            System.out.println(mapentry.getKey() + "\t" + mapentry.getValue() + " : " +
                    prix );
        }
        System.out.println("Prix = " + calculeDePrix.getTotal(facture));
        System.out.println("PrixTTC = " + calculeDePrix.getTotalTTC(facture));
    }
}
