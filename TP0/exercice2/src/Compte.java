import java.util.ArrayList;

public class Compte {
    private ArrayList<Operation> operations;
    private String id;
    private String dateCreation;
    private double montant;
    private TypeCompte typeCompte;

    public Compte(String id, String dateCreation, TypeCompte typeCompte) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.typeCompte = typeCompte;
        this.operations = new ArrayList<>();
        this.montant = 0;
    }
    public boolean addOperation(Operation operation){
        if(this.typeCompte == TypeCompte.Courant){
            if(operation.getTypeOperation() == TypeOperation.Debit){
                this.operations.add(operation);
                this.montant+= operation.getMontant();
                return true;
            }
            else{
                if(this.montant >= operation.getMontant()){
                    this.operations.add(operation);
                    this.montant-= operation.getMontant();
                   return true;
                }
                return false;
            }
        }
        else{
            if(operation.getTypeOperation() == TypeOperation.Debit){
                this.operations.add(operation);
                this.montant+= operation.getMontant()*0.05;
                return true;
            }
            else{
                if(this.montant >= operation.getMontant()*0.1 &&
                        java.time.LocalDate.now().getYear() > Integer.parseInt(this.dateCreation.split("/")[2]))
                {
                    this.operations.add(operation);
                    this.montant-= operation.getMontant()*0.1;
                    return true;
                }
                return false;
            }
        }

    }
}
