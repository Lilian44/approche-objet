package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;

public class TopCitiesPays extends MenuService{
	
	public void traiter(ArrayList<Ville> allCities, String scan) {

	

		Collections.sort(allCities, new ComparatorCities());
		System.out.println("les plus grandes villes du pays sont :\n");
		for (int i = 0; i < 10; i++) {
			System.out.println(allCities.get(i).getNomCommune());

		}
	}

}
