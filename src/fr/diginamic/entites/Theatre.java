package fr.diginamic.entites;

public class Theatre {
	private String name;
	private int capaciteMax;
	private int totalClients;
	private int recette;

	public Theatre(String name, int capaciteMax) {
		this.name = name;
		this.capaciteMax = capaciteMax;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	public int getNbrClients() {
		return totalClients;
	}

	public int getRecette() {
		return recette;
	}

	public void setRecette(int recette) {
		this.recette = recette;
	}

	public void inscrire(int nbrClients, int prixPlace) {
		if (capaciteMax >= totalClients+nbrClients) {
			totalClients += nbrClients;
			recette += nbrClients * prixPlace;
			System.out.println("il reste " + (capaciteMax-totalClients)+"places" );
		} else if (capaciteMax <= nbrClients) {
			recette += (capaciteMax-totalClients)*prixPlace;
			totalClients+= capaciteMax-totalClients;
			System.out.println("plus de place disponiables");
		}
		else {
			System.out.println("plus de place disponiables");
		}

	}

}
