package fr.diginamic.recensement;

import java.util.Comparator;
import java.util.List;

import fr.diginamic.recensementIntro.Region;

public class ComparatorRegion implements Comparator<Integer> {
	


	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if (o1 > o2) {
			return -1;
		} else if (o1 < o2) {
			return 1;
		}
		return 0;
	}
	
	
	
	
	

}
