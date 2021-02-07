package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;

public class TopCitiesDep extends MenuService {

	public void traiter(ArrayList<Ville> allCities, String dptmt) {

		ArrayList<Ville> biggestCitiesDptmt = new ArrayList<>();
		for (int i = 0; i < allCities.size(); i++) {
			if (allCities.get(i).getCodeDepartement().equals(dptmt)) {
				biggestCitiesDptmt.add(allCities.get(i));

			}

		}

		Collections.sort(biggestCitiesDptmt, new ComparatorCities());
		System.out.println("les plus grandes villes du"+dptmt+ "sont :\n");
		for (int i = 0; i < 10; i++) {
			System.out.println(biggestCitiesDptmt.get(i).getNomCommune());

		}
	}

	

}
