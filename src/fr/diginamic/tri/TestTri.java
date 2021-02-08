package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Collections;

public class TestTri {

	
	public static void main(String[] args) {
		Ville Nice = new Ville("Nice", 343000);
		Ville Carcassonne = new Ville("Carcassonne", 47800);
		Ville Narbonne = new Ville("Narbonne", 53400);
		Ville Lyon = new Ville("Lyon", 484000);
		Ville Foix = new Ville("Foix", 9700);
		Ville Pau = new Ville("Pau", 77200);
		Ville Marseille = new Ville("Marseille", 850700);
		Ville Tarbes = new Ville("Tarbes", 40600);

		ArrayList<Ville> villes = new ArrayList<Ville>();
		Collections.addAll(villes, Nice, Carcassonne, Narbonne, Lyon, Foix, Pau, Marseille, Tarbes);

	//	Collections.sort( villes);
		Collections.sort(villes,new ComparatorNom());
		System.out.println(villes);
		
	
		
		
	}
}
