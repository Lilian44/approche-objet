package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {
	public static void main(String[] args) {

		Rectangle rect = new Rectangle(10, 5);
		Carre carr = new Carre(10, 5);
		Cercle cerc = new Cercle(4);

		AffichageForme test = new AffichageForme();
		test.afficher(cerc);
		test.afficher(rect);
		test.afficher(carr);

	}
}
