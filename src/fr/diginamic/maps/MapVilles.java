package fr.diginamic.maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import fr.diginamic.listes.Ville;

public class MapVilles {
	public static void main(String[] args) {
		Ville Nice = new Ville("Nice", 343000);
		Ville Carcassonne = new Ville("Carcassonne", 47800);
		Ville Narbonne = new Ville("Narbonne", 53400);
		Ville Lyon = new Ville("Lyon", 484000);
		Ville Foix = new Ville("Foix", 9700);
		Ville Pau = new Ville("Pau", 77200);
		Ville Marseille = new Ville("Marseille", 850700);
		Ville Tarbes = new Ville("Tarbes", 40600);

		HashMap<String, Ville> cityMap = new HashMap<>();
		cityMap.put(Nice.getNom(), Nice);
		cityMap.put(Carcassonne.getNom(), Carcassonne);
		cityMap.put(Narbonne.getNom(), Narbonne);
		cityMap.put(Lyon.getNom(), Lyon);
		cityMap.put(Foix.getNom(), Foix);
		cityMap.put(Pau.getNom(), Pau);
		cityMap.put(Marseille.getNom(), Marseille);
		cityMap.put(Tarbes.getNom(), Tarbes);

		Iterator<String> allCityKey = cityMap.keySet().iterator();

		Ville citymin = Nice;
		String keyCityMin = null;
		while (allCityKey.hasNext()) {

			String key = allCityKey.next();
			if (citymin.habitants > cityMap.get(key).habitants) {
				citymin = cityMap.get(key);
				keyCityMin = key;

			}

		}
		System.out.println(citymin.nom);
		cityMap.remove(keyCityMin);
		System.out.println(cityMap);

	}
}
