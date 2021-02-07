package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import fr.diginamic.recensementIntro.ComparatorDepartement;
import fr.diginamic.recensementIntro.Departement;

public class DepartementTopTen extends MenuService {
	public void traiter(ArrayList<Ville> allCities, String scan) {

		HashMap<String, Departement> depmts = new HashMap<>();

		List<Departement> allDpmt = new ArrayList<>();

		for (int i = 0; i < allCities.size(); i++) {

			String dpmt = allCities.get(i).getCodeDepartement();
			int dpmtPop = allCities.get(i).getPopulationTotale();

			if (depmts.containsKey(dpmt)) {

				depmts.get(dpmt).setHabitants(depmts.get(dpmt).getHabitants() + dpmtPop);

			} else {
				depmts.put(dpmt, new Departement(dpmt, dpmtPop));
				allDpmt.add(depmts.get(dpmt));

			}

			Collections.sort(allDpmt, new ComparatorDepartement());

		}
		System.out.println("\n Les plus grand départements de France sont : ");
		for (int i = 0; i < 10; i++) {
			System.out.println(allDpmt.get(i));
		}

	}
}
