package fr.diginamic.formes;

public class Carre extends Rectangle {


	public Carre(double longueur,double largeur) {
		super( longueur,largeur);

	}

	@Override
	public void calculerSurface() {
		// TODO Auto-generated method stub
		System.out.println(this.longueur * this.longueur);

	}

	@Override
	public void calculerPerimetre() {
		System.out.println((this.longueur * 4));
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
		return "carre";
	}
	

}
