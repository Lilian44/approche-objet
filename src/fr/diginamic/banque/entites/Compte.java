package fr.diginamic.banque.entites;

public class Compte {
	
	private String numeroCompte;
	private double solde ;
	

	public Compte(String numeroCompte, double solde) {
		
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}
	
	public String toString() {
		return ("num�ro de compte: "+numeroCompte +" solde du compte: "+ solde);
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}



}
