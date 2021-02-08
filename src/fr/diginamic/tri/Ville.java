package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Ville implements Comparable<Ville> {
	public String nom;
	public int habitants;

	public Ville(String nom, int habitants) {
		super();
		this.nom = nom;
		this.habitants = habitants;

	}

	public boolean equals(Object obj) {
		
		if(!(obj instanceof Ville)) {
			return false;
		}
		Ville other = (Ville)obj;
		
		return this.nom.equals(other.getNom()) && this.habitants== other.getHabitants() ;
		
		
	}

	@Override
	public int compareTo(Ville autre) {
		// TODO Auto-generated method stub
//		return this.nom.compareTo(autre.getNom());
		if (this.habitants > autre.getHabitants()) {
			return 1;
		}
		if (this.habitants < autre.getHabitants()) {
			return -1;
		}
		return 0;

	}

	@Override
	public String toString() {
		return "nom=" + nom + ", habitants=" + habitants + "\n";
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
