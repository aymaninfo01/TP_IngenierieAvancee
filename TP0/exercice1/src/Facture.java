import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Facture {
    private int id;
    private HashMap<Produit, Integer> produits;
    private static double TVA;

    public Facture(int id) {
        this.id = id;
        this.produits = new HashMap<>();
    }

    public static double getTVA() {
        return TVA;
    }

    public static void setTVA(double TVA) {
        Facture.TVA = TVA;
    }
    public void addProduit(Produit produit, int quantité){
         this.produits.put(produit, quantité);
    }
    public double getTotal(){
        double total = 0;
        for (Map.Entry mapentry : this.produits.entrySet()) {
            total+= ((Produit)mapentry.getKey()).getPrix() * ((Double)mapentry.getValue());
        }
        return total;
    }
    public double getTotalTTC(){
        return this.getTotal()*(1+this.TVA);
    }
    public void imprimer(){
        double prix;
        for (Map.Entry mapentry : this.produits.entrySet()) {
            prix = ((Produit)mapentry.getKey()).getPrix() * ((Double)mapentry.getValue());
            System.out.println(mapentry.getKey() + "\t" + mapentry.getValue() + " : " +
                    prix );
        }
        System.out.println("Prix = " + this.getTotal());
        System.out.println("PrixTTC = " + this.getTotalTTC());
    }
    public void saveFacture() {
        try {
            // create a FileWriter object with the file name
            String file = "Facture".concat(String.valueOf(this.id));
            FileWriter writer = new FileWriter(file);
            writer.write(this.id);
            // write the string to the file
            for (Map.Entry mapentry : this.produits.entrySet()) {
                writer.write(mapentry.getKey().toString() + "\t" + mapentry.getValue().toString() );
            }
            writer.write("Prix = " + this.getTotal());
            writer.write("PrixTTC = " + this.getTotalTTC());
            // close the writer
            writer.close();

            System.out.println("Successfully wrote text to file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
