package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorDepartement implements Comparator<Departement> {

	@Override
	public int compare(Departement o1, Departement o2) {
		// TODO Auto-generated method stub
		if(o1.getHabitants() >o2.getHabitants() ) {
			return -1;
		} else if(o1.getHabitants() <o2.getHabitants()){
			return 1;
		}
		return 0;
	}

}
