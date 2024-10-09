package refactoring;

import java.util.HashMap;

public class Facture {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;


    private HashMap<Produit, Integer> produits;

    public HashMap<Produit, Integer> getProduits() {
        return produits;
    }




    public Facture(int id) {
        this.id = id;
        this.produits = new HashMap<>();
    }

    public void addProduit(Produit produit, int quantité){
        this.produits.put(produit, quantité);
    }
}
