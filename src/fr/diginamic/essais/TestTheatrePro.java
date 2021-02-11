package fr.diginamic.essais;

import fr.diginamic.entites.Spectacle;
import fr.diginamic.entites.TheatrePro;

public class TestTheatrePro {

	public static void main(String[] args) {

		TheatrePro theatre1 = new TheatrePro("super-theatre");

		Spectacle spe1 = new Spectacle("Hellfest", "concert", 200, 500, 480);
		Spectacle spe2 = new Spectacle("iron maiden", "concert", 200, 500, 480);
		Spectacle spe3 = new Spectacle("metallica", "concert", 200, 500, 480);

		theatre1.ajouterSpectacle(spe1);
		theatre1.ajouterSpectacle(spe2);
		theatre1.ajouterSpectacle(spe3);

		theatre1.getSpectacle("iron maiden");
		theatre1.getRecetteTotale();
		theatre1.getNbTotalClients();

	}

}
