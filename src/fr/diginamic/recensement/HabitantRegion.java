package fr.diginamic.recensement;

import java.util.ArrayList;

public class HabitantRegion extends MenuService {

	public void traiter( ArrayList<Ville> allCities,String rgn) {
		int hab = 0;
		for (int i = 0; i < allCities.size(); i++) {
			if (allCities.get(i).getCodeRegion().equals(rgn)) {
				hab += allCities.get(i).getPopulationTotale();
			}
		}
		if (hab == 0) {
			System.out.println("Cette région n'existe pas");
		}
		System.out.println("il y a " + hab + " habitant dans cette région");

	}

}
