package fr.diginamic.entites;

public class Cercle {
	public double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public double perimetreCercle(double rayon) {
		double perimetre = 2 * 3.14 * rayon;

		return perimetre;
	}
	
	public double surfaceCercle(double rayon) {
		double air = 3.14 * (rayon*rayon);

		return air;
	}

}
