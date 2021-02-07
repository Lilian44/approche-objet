package fr.diginamic.recensement;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import fr.diginamic.recensementIntro.ComparatorRegions;
import fr.diginamic.recensementIntro.Region;

public class RegionTopTen extends MenuService {

	public void traiter(ArrayList<Ville> allCities, String scan) {
		HashMap<String, Region> regions = new HashMap<>();

		List<Region> allRegion = new ArrayList<>();

		for (int i = 0; i < allCities.size(); i++) {

			String rgns = allCities.get(i).getCodeRegion();
			int rgnPop = allCities.get(i).getPopulationTotale();

			if (regions.containsKey(rgns)) {

				regions.get(rgns).setHabitantsRegion(regions.get(rgns).getHabitantsRegion() + rgnPop);

			} else {
				regions.put(rgns, new Region(rgns, rgnPop));
				allRegion.add(regions.get(rgns));

			}
		}
		
		Collections.sort(allRegion, new ComparatorRegions() );
		
		System.out.println("Les 10 régions les plus peuplés de France sont :");
		for (int i = 0; i < 10; i++) {
			System.out.println(allRegion.get(i));
			
		}

	}
}