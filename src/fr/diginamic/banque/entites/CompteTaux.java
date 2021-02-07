package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	private String numeroCompte;
	private double solde;
	private double tauxRemuneration;

	public CompteTaux(String numeroCompte, double solde, double tauxRemuneration) {
		super(numeroCompte, solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	

	public String toString() {
		String compteC = super.toString();
		return compteC +" taux de remuneration: " +tauxRemuneration;
	}

}
