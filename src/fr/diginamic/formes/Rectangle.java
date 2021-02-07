package fr.diginamic.formes;

public class Rectangle extends Forme {
	double longueur;
	double largeur;

	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public void calculerSurface() {
		// TODO Auto-generated method stub
		System.out.println(this.longueur * this.largeur);

	}

	@Override
	public void calculerPerimetre() {
		System.out.println((this.longueur * 2) + (this.largeur * 2));
		// TODO Auto-generated method stub

	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	public static String afficherType() {
		return "rectangle";
	}


}
