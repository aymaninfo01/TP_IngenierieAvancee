package refactoring;

import java.util.Map;

public class CalculeDePrix {

    private static double TVA;

    public static double getTVA() {
        return TVA;
    }

    public static void setTVA(double TVA) {
        CalculeDePrix.TVA = TVA;
    }

    public double getTotal(Facture facture){
        double total = 0;
        for (Map.Entry mapentry : facture.getProduits().entrySet()) {
            total+= ((Produit)mapentry.getKey()).getPrix() * ((Integer)mapentry.getValue());
        }
        return total;
    }
    public double getTotalTTC(Facture facture){
        return this.getTotal(facture)*(1+this.TVA);
    }
    public void imprimer(Facture facture){
        double prix;
        for (Map.Entry mapentry : facture.getProduits().entrySet()) {
            prix = ((Produit)mapentry.getKey()).getPrix() * ((Double)mapentry.getValue());
            System.out.println(mapentry.getKey() + "\t" + mapentry.getValue() + " : " +
                    prix );
        }
        System.out.println("Prix = " + this.getTotal(facture));
        System.out.println("PrixTTC = " + this.getTotalTTC(facture));
    }
}
