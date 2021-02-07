package fr.diginamic.recensementIntro;

import java.util.ArrayList;

import fr.diginamic.recensementIntro.Ville;

public class Montpellier {
	
	ArrayList<Ville> villes;
	

	public Montpellier(ArrayList<Ville> villes) {
		super();
		this.villes = villes;
	}


	 public void afficherMontpellier(ArrayList<Ville> ville) {

		for (int i = 0; i < this.villes.size(); i++) {
			if (ville.get(i).getNomCommune().equals("Montpellier")) {
				System.out.println(ville.get(i));
			
			}

		}
		
	}
	 

	 
	 
	 
	 
	 
	 
}
