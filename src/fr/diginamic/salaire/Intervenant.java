package fr.diginamic.salaire;

public abstract class Intervenant {
	int nom;
	int prenom;

	public abstract void getSalaire();

	public void afficherDonnes() {
		System.out.println(this.nom);
		System.out.println(this.prenom);

	}

}
