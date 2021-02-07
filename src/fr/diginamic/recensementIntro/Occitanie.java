package fr.diginamic.recensementIntro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Occitanie {

	public void populationOccitanie(ArrayList<Ville> villes) {
		ArrayList<Ville> cityOccitanie = new ArrayList<>();

		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).getNomRegion().equals("Occitanie")) {
				cityOccitanie.add(villes.get(i));

			}
		}
		int total = 0;
		for (int i = 0; i < cityOccitanie.size(); i++) {
			total += cityOccitanie.get(i).populationTotale;

		}
		System.out.println("La population totale en Occitanie est de : " + total + " habitants");

	}

	public void topTen(ArrayList<Ville> villes) {
		ArrayList<Ville> cityTopOccitanie = new ArrayList<>();

		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).getNomRegion().equals("Occitanie")) {
				cityTopOccitanie.add(villes.get(i));

			}
		}
		System.out.println(cityTopOccitanie.get(0));

		Collections.sort(cityTopOccitanie, new ComparatorHabitants());
		System.out.println("les plus grandes villes d'occitanie sont : ");
		for (int i = 0; i < 10; i++) {
			System.out.println(cityTopOccitanie.get(i).getNomCommune());
		}

	}

}
