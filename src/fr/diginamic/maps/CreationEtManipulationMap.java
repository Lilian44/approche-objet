package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {
	public static void main(String[] args) {

		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		Iterator<Integer> key = mapVilles.keySet().iterator();

		while (key.hasNext()) {

			Integer dpt = key.next();
			System.out.println(dpt);
		}

		Iterator<String> value = mapVilles.values().iterator();

		while (value.hasNext()) {

			String ville = value.next();
			System.out.println(ville);
		}
		
		System.out.println(mapVilles.size());

	}
}
