package fr.diginamic.objetGeometrique;

public class Cercle implements ObjetGeometrique{
	double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	public  double perimetre() {
		double per;
		per= 2*3.14*rayon;
		// TODO Auto-generated method stub
		return per;
	}

	@Override
	public double surface() {
		double air;
		air= 3.14 *(rayon*rayon);
		// TODO Auto-generated method stub
		return air;
	}

}
