package fr.diginamic.recensementIntro;

import java.util.ArrayList;
import java.util.Collections;



public class PopulationHérault {

	public void Population(ArrayList<Ville> villes) {
		int total = 0;
		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).getCodeDepartement().equals("34")) {
				total += villes.get(i).populationTotale;

			}

		}
		System.out.println("il y a " + total + " d'habitants dans l’Hérault.");

	}

	public void plusPetiteVille(ArrayList<Ville> ville) {
		Ville little = ville.get(0);
		for (int i = 0; i < ville.size(); i++) {
			if (ville.get(i).getCodeDepartement().equals("34")) {
				if (ville.get(i).getPopulationTotale() < little.populationTotale)
					;
				little = ville.get(i);

			}

		}
		System.out.println("la plus petite ville de l'Hérault est " + little.getNomCommune());

	}

	public void biggestCities(ArrayList<Ville> ville) {

		ArrayList<Ville> biggest = new ArrayList<>();
		for (int i = 0; i < ville.size(); i++) {
			if (ville.get(i).getCodeDepartement().equals("34")) {
				biggest.add(ville.get(i));

			}

		}

		Collections.sort(biggest, new ComparatorHabitants());
		System.out.println("les plus grandes villes de l'hérault sont :\n");
		for (int i = 0; i < 10; i++) {
			System.out.println(biggest.get(i).getNomCommune());

		}

	}
	
	public void smallestCities(ArrayList<Ville> ville) {

		ArrayList<Ville> biggest = new ArrayList<>();
		for (int i = 0; i < ville.size(); i++) {
			if (ville.get(i).getCodeDepartement().equals("34")) {
				biggest.add(ville.get(i));

			}

		}

		Collections.sort(biggest, new ComparatorLittleCity());
		System.out.println("les plus petites villes de l'hérault sont :\n");
		for (int i = 0; i < 10; i++) {
			System.out.println(biggest.get(i).getNomCommune());

		}

	}
	
	
	
	
	
}
