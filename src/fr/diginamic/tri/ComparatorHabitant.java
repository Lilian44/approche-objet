package fr.diginamic.tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

	@Override
	public int compare(Ville o1, Ville o2) {
		// TODO Auto-generated method stub
		if (o1.getHabitants() > o2.getHabitants()) {
			return 1;
		} else if (o1.getHabitants() < o2.getHabitants()) {
			return -1;
		}
		return 0;
	}

}
