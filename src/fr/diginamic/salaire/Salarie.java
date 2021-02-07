package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	public double salaire;
	
	public Salarie(String nom, String prenom ,double salaire) {
		super();
		this.salaire = salaire;
	}

	public void getSalaire() {
		System.out.println("le salaire est de :"+this.salaire);
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	



	

}
