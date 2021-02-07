package fr.diginamic.recensementIntro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class BiggestDepartmentOccitanie {

	public void Departements(ArrayList<Ville> villes) {
		
		ArrayList<Ville> cityOccitanie = new ArrayList<>();
		
		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).getNomRegion().equals("Occitanie")) {
				cityOccitanie.add(villes.get(i));

			}
		}

		HashMap<String, Departement> deptmt = new HashMap<>();

		List<Departement> allDptmt = new ArrayList<>();
		for (int i = 0; i < cityOccitanie.size(); i++) {
			String cityCodeDptmt = cityOccitanie.get(i).getCodeDepartement();
			int people = cityOccitanie.get(i).getPopulationTotale();

			if (deptmt.containsKey(cityCodeDptmt)) {

				deptmt.get(cityCodeDptmt).setHabitants(deptmt.get(cityCodeDptmt).getHabitants() + people);
			} else {
				deptmt.put(cityCodeDptmt, new Departement(cityCodeDptmt, people));
				allDptmt.add(deptmt.get(cityCodeDptmt));
				
				

			}
		}
		
		Collections.sort(allDptmt, new ComparatorDepartement());
		System.out.println("Le departement le plus peuplé est : ");
		System.out.println(allDptmt.get(0));
		

	}
}
