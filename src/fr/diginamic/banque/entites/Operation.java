package fr.diginamic.banque.entites;

abstract public  class Operation {
	protected String dateOpertaion;
	protected int montant;

	public Operation(String dateOpertaion, int montant) {

		this.dateOpertaion = dateOpertaion;
		this.montant = montant;
	}
	
	public String toString() {
		return ("date: "+dateOpertaion+"   montant de l'operation: " +montant);
	}
	
	abstract public String afficherType(); 

	public String getDateOpertaion() {
		return dateOpertaion;
	}

	public void setDateOpertaion(String dateOpertaion) {
		this.dateOpertaion = dateOpertaion;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

}
