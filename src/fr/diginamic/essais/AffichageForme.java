package fr.diginamic.essais;

import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Rectangle;
import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;

public class AffichageForme {

	
	public static void afficher(Forme form) {	
		if(form instanceof Rectangle) {
			form.calculerPerimetre();
			form.calculerSurface();
		};
		if(form instanceof Carre) {
			form.calculerPerimetre();
			form.calculerSurface();
		};
		if(form instanceof Cercle) {
			form.calculerPerimetre();
			form.calculerSurface();
		};


	};
	
	
	
	
	
}
