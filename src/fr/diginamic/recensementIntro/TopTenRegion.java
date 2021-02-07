package fr.diginamic.recensementIntro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TopTenRegion {

	public void topTen(ArrayList<Ville> villes) {

		HashMap<String, Region> regions = new HashMap<>();

		List<Region> allRegion = new ArrayList<>();

		for (int i = 0; i < villes.size(); i++) {

			String rgns = villes.get(i).getCodeRegion();
			int rgnPop = villes.get(i).populationTotale;

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
