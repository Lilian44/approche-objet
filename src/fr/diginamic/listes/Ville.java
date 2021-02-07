package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ville {
	public String nom;
	public int habitants;

	public Ville(String nom, int habitants) {
		super();
		this.nom = nom;
		this.habitants = habitants;

	}

	public static void main(String[] args) {

		Ville Nice = new Ville("Nice", 343000);
		Ville Carcassonne = new Ville("Carcassonne", 47800);
		Ville Narbonne = new Ville("Narbonne", 53400);
		Ville Lyon = new Ville("Lyon", 484000);
		Ville Foix = new Ville("Foix", 9700);
		Ville Pau = new Ville("Pau", 77200);
		Ville Marseille = new Ville("Marseille", 850700);
		Ville Tarbes = new Ville("Tarbes", 40600);

		ArrayList<Ville> villes = new ArrayList<Ville>();
		Collections.addAll(villes, Nice, Carcassonne, Narbonne, Lyon, Foix, Pau, Marseille, Tarbes);

		Ville villeMax = null;

		int MaxHab = 0;
		for (int i = 0; i < villes.size(); i++) {
			if (MaxHab < villes.get(i).habitants) {
				MaxHab = villes.get(i).habitants;
				villeMax = villes.get(i);
			}

		}

		System.out.println(villeMax.nom);

		Ville villeMin = null;

		int minHab = 0;
		for (int i = 0; i <= villes.size() - 1; i++) {
			if (i == 0) {
				minHab = villes.get(i).habitants;
				villeMin = villes.get(i);
			}
			if (minHab > villes.get(i).habitants) {
				minHab = villes.get(i).habitants;
				villeMin = villes.get(i);

			}

		}
		System.out.println(villeMin.nom);

		Iterator<Ville> cities = villes.iterator();

		while (cities.hasNext()) {

			Ville city = cities.next();
			if (city.nom == villeMin.nom) {
				cities.remove();
			}

		}

		for (int i = 0; i <= villes.size() - 1; i++) {
			if (villes.get(i).habitants > 100000) {
				villes.get(i).nom = villes.get(i).nom.toUpperCase();
				System.out.println(villes.get(i).nom);
			}
		}

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getHabitants() {
		return habitants;
	}

	public void setHabitants(int habitants) {
		this.habitants = habitants;
	}

	
}
