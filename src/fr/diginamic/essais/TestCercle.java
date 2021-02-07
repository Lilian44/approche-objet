package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;

public class TestCercle {
	public static void main(String[] args) {
		Cercle c = new Cercle(3);
		Cercle c2 = new Cercle(6);

		double perimetreC1 = c.perimetreCercle(3);
		double surfaceC1 = c.surfaceCercle(3);
		System.out.println(perimetreC1);
		System.out.println(surfaceC1);
		
		double perimetreC2 = c.perimetreCercle(6);
		double surfaceC2 = c.surfaceCercle(6);
		System.out.println(perimetreC2);
		System.out.println(surfaceC2);
	}

}
