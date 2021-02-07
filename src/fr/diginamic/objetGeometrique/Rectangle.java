package fr.diginamic.objetGeometrique;

public class Rectangle implements ObjetGeometrique{
	
	static double longueur;
	static double largeur;

	public Rectangle(double longueur, double largeur) {
		super();
		Rectangle.longueur = longueur;
		Rectangle.largeur = largeur;
	}

	public double perimetre() {
		double perim;
		perim= (longueur*2)+(largeur*2);
		// TODO Auto-generated method stub
		return perim;
	}

	public double surface() {
		double air;
		air= longueur*largeur;
		// TODO Auto-generated method stub
		return air;
	}

}
