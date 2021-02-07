package fr.diginamic.recensementIntro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TopTenDepartement {

	public void topTen(ArrayList<Ville> villes) {

		HashMap<String, Departement> depmts = new HashMap<>();

		List<Departement> allDpmt = new ArrayList<>();

		for (int i = 0; i < villes.size(); i++) {

			String dpmt = villes.get(i).getCodeDepartement();
			int dpmtPop = villes.get(i).populationTotale;

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
