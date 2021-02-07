package fr.diginamic.recensement;

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
