package refactoring;

class GestionDesOperations {

    public boolean effectuerOperation(Compte compte, Operation operation) {
        if (compte.getTypeCompte() == TypeCompte.Courant) {
            return traiterOperationCourant(compte, operation);
        } else {
            return traiterOperationEpargne(compte, operation);
        }
    }

    private boolean traiterOperationCourant(Compte compte, Operation operation) {
        // Logique spécifique aux comptes courants
        if (operation.getTypeOperation() == TypeOperation.Debit) {
            compte.addOperation(operation);
            compte.setMontant(compte.getMontant() + operation.getMontant());
            return true;
        } else {
            if (compte.getMontant() >= operation.getMontant()) {
                compte.addOperation(operation);
                compte.setMontant(compte.getMontant() - operation.getMontant());
                return true;
            }
            return false;
        }
    }

    private boolean traiterOperationEpargne(Compte compte, Operation operation) {
        // Logique spécifique aux comptes d'épargne
        if (operation.getTypeOperation() == TypeOperation.Debit) {
            compte.addOperation(operation);
            compte.setMontant(compte.getMontant() + operation.getMontant() * 0.05);
            return true;
        } else {
            if (compte.getMontant() >= operation.getMontant() * 0.1 &&
                    java.time.LocalDate.now().getYear() > Integer.parseInt(compte.getDateCreation().split("/")[2])) {
                compte.addOperation(operation);
                compte.setMontant(compte.getMontant() - operation.getMontant() * 0.1);
                return true;
            }
            return false;
        }
    }
}
