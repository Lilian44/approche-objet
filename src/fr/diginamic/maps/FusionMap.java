package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

public class FusionMap {
	public static void main(String args[]) {
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		// TODO Développements à réaliser ci-dessous

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();

//		for (int i = 1; i <= (map1.size() + map2.size()); i++) {
//			if (i <= map1.size()) {
//
//				map3.put(i, map1.get(i));
//			}
//			if (i > map1.size()) {
//				map3.put(i, map2.get(i));
//			}
//
//		}
		Iterator<Integer> keyColor = map1.keySet().iterator();

		while (keyColor.hasNext()) {
			Integer key = keyColor.next();
			map3.put(key, map1.get(key));

		}
		Iterator<Integer> keyColor2 = map2.keySet().iterator();

		while (keyColor2.hasNext()) {
			Integer key2 = keyColor2.next();
			map3.put(key2, map2.get(key2));

		}

		System.out.println(map3);
	}
}
