package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;

public class TopCitiesRegion extends MenuService{
	
	
	public void traiter(ArrayList<Ville> allCities, String rgn) {

		ArrayList<Ville> biggestCitiesRgn = new ArrayList<>();
		for (int i = 0; i < allCities.size(); i++) {
			if (allCities.get(i).getCodeRegion().equals(rgn)) {
				biggestCitiesRgn.add(allCities.get(i));

			}

		}

		Collections.sort(biggestCitiesRgn, new ComparatorCities());
		System.out.println("les plus grandes villes de la région "+rgn+ " sont :\n");
		for (int i = 0; i < 10; i++) {
			System.out.println(biggestCitiesRgn.get(i).getNomCommune());

		}
	}

}
