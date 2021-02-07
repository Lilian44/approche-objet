package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeString {
	public static void main(String[] args) {

		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Nice");
		cities.add("Carcassonne");
		cities.add("Narbonne");
		cities.add("Lyon");
		cities.add("Foix");
		cities.add("Pau");
		cities.add("Marseille");
		cities.add("Tarbes");

		String biggest="" ;
		for (int i = 0; i < cities.size() - 1; i++) {
			if (biggest.length() < cities.get(i).length()) {
				biggest = cities.get(i);
				
			}

		}
		System.out.println(biggest);
		
		for (int i = 0; i <= cities.size() - 1; i++) {
			cities.set(i, cities.get(i).toUpperCase());

		}
	
		
		Iterator<String> citiesLess = cities.iterator();
		
		while(citiesLess.hasNext()) {
			
			String city = citiesLess.next();
			if(city.charAt(0)=='N') {
				citiesLess.remove();
			}
			
			
		}
		System.out.println(cities);
		
		

	}

}
