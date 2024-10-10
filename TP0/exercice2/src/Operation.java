public class Operation {
    private double montant;
    private TypeOperation typeOperation;

    public Operation(double montant, TypeOperation typeOperation) {
        this.montant = montant;
        this.typeOperation = typeOperation;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public TypeOperation getTypeOperation() {
        return typeOperation;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "montant=" + montant +
                ", typeOperation=" + typeOperation +
                '}';
    }

}
