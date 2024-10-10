package refactoring;

import java.util.ArrayList;

public class Compte {
    private ArrayList<Operation> operations;
    private String id;
    private String dateCreation;
    private double montant;
    private TypeCompte typeCompte;

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    public void setOperations(ArrayList<Operation> operations) {
        this.operations = operations;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public TypeCompte getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(TypeCompte typeCompte) {
        this.typeCompte = typeCompte;
    }

    public Compte(String id, String dateCreation, TypeCompte typeCompte) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.typeCompte = typeCompte;
        this.operations = new ArrayList<>();
        this.montant = 0;
    }
    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }

}
