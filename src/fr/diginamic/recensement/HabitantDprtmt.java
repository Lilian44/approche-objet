package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Iterator;

public class HabitantDprtmt extends MenuService {
	

	public void traiter( ArrayList<Ville> allCities,String dptmt) {
		int hab=0;
		for (int i = 0; i < allCities.size(); i++) {
			if (allCities.get(i).getCodeDepartement().equals(dptmt)) {
				hab+=allCities.get(i).getPopulationTotale();
			}
		}
		System.out.println("il y a "+hab+" habitant dans ce département");

	}



}
