package fr.diginamic.testenumeration;

public enum Saison {

	PRINTEMPS("Printemps", 1), ETE("Ete", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

	private String nom;
	private int libel;

	private Saison(String nom, int libel) {
		this.nom = nom;
		this.libel = libel;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getLibel() {
		return libel;
	}

	public void setLibel(int libel) {
		this.libel = libel;
	}

}
