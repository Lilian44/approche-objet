package fr.diginamic.entites;

public class Spectacle {
	private String nom;
	private String typeSpectacle;
	private double tarif;
	private int capaciteMax;
	private int nbrInscrits;

	public Spectacle(String nom, String typeSpectacle, double tarif, int capaciteMax, int nbrInscrits) {
		super();
		this.nom = nom;
		this.typeSpectacle = typeSpectacle;
		this.tarif = tarif;
		this.capaciteMax = capaciteMax;
		this.nbrInscrits = nbrInscrits;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTypeSpectacle() {
		return typeSpectacle;
	}

	public void setTypeSpectacle(String typeSpectacle) {
		this.typeSpectacle = typeSpectacle;
	}

	public double getTarif() {
		return tarif;
	}

	public void setTarif(double tarif) {
		this.tarif = tarif;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	public int getNbrInscrits() {
		return nbrInscrits;
	}

	public void setNbrInscrits(int nbrInscrits) {
		this.nbrInscrits = nbrInscrits;
	}

}
