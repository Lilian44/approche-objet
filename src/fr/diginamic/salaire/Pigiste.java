package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	int joursTravaille;
	double montantJournalier;
	
	public Pigiste(String nom, String prenom ,int joursTravaille, double montantJournalier) {
		super();
		this.joursTravaille = joursTravaille;
		this.montantJournalier = montantJournalier;
	}
	
	

	public int getJoursTravaille() {
		return joursTravaille;
	}

	public void setJoursTravaille(int joursTravaille) {
		this.joursTravaille = joursTravaille;
	}

	public double getMontantJournalier() {
		return montantJournalier;
	}

	public void setMontantJournalier(double montantJournalier) {
		this.montantJournalier = montantJournalier;
	}



	@Override
	public void getSalaire() {
		// TODO Auto-generated method stub
		System.out.println(this.joursTravaille*this.montantJournalier);
		
	}

}
