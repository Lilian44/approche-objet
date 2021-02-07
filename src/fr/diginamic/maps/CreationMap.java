package fr.diginamic.maps;

import java.util.HashMap;

public class CreationMap {
public static void main(String[] args) {
	
	HashMap<Integer, String> mapSalaires = new HashMap<>();
	mapSalaires.put(1750, "Paul");
	mapSalaires.put(1825, "Hicham");
	mapSalaires.put(2250, "Yu");
	mapSalaires.put(2015, "Ingrid");
	mapSalaires.put(2418, "Chantal");
	
	System.out.println(mapSalaires.size());
	
	
	
}
}
