package fr.diginamic.recensement;

/** 
 * Classe servant � la cr�ation d'un objet D�partement, il a comme attributs le num�ro du 
 * ainsi que son nombre d'habtiants
 * 
 */

public class Departement {
	String dprtmt;
	int Habitants;

	public Departement(String dprtmt, int habitants) {
		super();
		this.dprtmt = dprtmt;
		Habitants = habitants;
	}

	@Override
	public String toString() {
		return "Departement [dprtmt=" + dprtmt + ", Habitants=" + Habitants + "]";
	}

	public String getDprtmt() {
		return dprtmt;
	}

	public void setDprtmt(String dprtmt) {
		this.dprtmt = dprtmt;
	}

	public int getHabitants() {
		return Habitants;
	}

	public void setHabitants(int habitants) {
		Habitants = habitants;
	}

}
