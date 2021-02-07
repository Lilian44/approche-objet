package fr.diginamic.recensement;

import java.util.ArrayList;

public class Rechercher extends MenuService {


	public void traiter( ArrayList<Ville> allCities,String nom) {

		for (int i = 0; i < allCities.size(); i++) {
			if (allCities.get(i).getNomCommune().equals(nom)) {
				System.out.println(allCities.get(i).getPopulationTotale() + " Habitants!");
			}

		}

	}
}
