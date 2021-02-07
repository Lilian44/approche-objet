package fr.diginamic.recensementIntro;

import java.util.Comparator;

public class ComparatorRegions implements Comparator<Region> {

	@Override
	public int compare(Region o1, Region o2) {
		// TODO Auto-generated method stub
		if (o1.getHabitantsRegion() > o2.getHabitantsRegion()) {
			return -1;
		} else if (o1.getHabitantsRegion() < o2.getHabitantsRegion()) {
			return 1;
		}
		return 0;
	}
}
