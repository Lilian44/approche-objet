package fr.diginamic.entites;

public class TheatrePro {
	private String nom;
	private Spectacle[] allShow;
	private double recetteTotale;

	public TheatrePro(String nom) {
		super();
		this.nom = nom;
		this.allShow = new Spectacle[0];
		this.recetteTotale = 0;
	}

	public void ajouterSpectacle(Spectacle spec) {

		Spectacle[] newtab = new Spectacle[allShow.length + 1];
		if (spec != null) {
			for (int i = 0; i < allShow.length; i++) {
				newtab[i] = allShow[i];
			}
			newtab[newtab.length - 1] = spec;
			allShow = newtab;
		}

	}

	public void getSpectacle(String nomShow) {
		boolean exist = false;

		for (int j = 0; j < allShow.length; j++) {
			if (allShow[j].getNom() == nomShow) {
				System.out.println(allShow[j].getNom() + " type:" + allShow[j].getTypeSpectacle() + " tarifs : "
						+ allShow[j].getTarif() + "euros, nombre d'inscrits: " + allShow[j].getNbrInscrits());
				exist = true;
			}
		}
		if (exist == false) {
			System.out.println("Aucun spectacle ne porte ce nom");
		}

	}

	public void inscrire(int nbrClients, String nomShow) {
		boolean showExists = false;
		if (nbrClients > 0 && nomShow != "") {

			for (int j = 0; j <= allShow.length - 1; j++) {
				if (allShow[j].getNom() == "nomShow") {
					showExists = true;
					if (allShow[j].getCapaciteMax() >= nbrClients + allShow[j].getNbrInscrits()) {

						allShow[j].setNbrInscrits(allShow[j].getNbrInscrits() + nbrClients);
						System.out.println("votre inscription a été prise en compte");
					} else {
						System.out.println("plus de place disponibles !");
					}
				}
			}
			if (showExists == false) {
				System.out.println("Aucun spectacle ne porte ce nom");
			}
		} else {
			System.out.println("veuillez entrez des paramètres cohérents");
		}

	}

	public double getRecetteTotale() {

		for (int i = 0; i <= allShow.length - 1; i++) {
			recetteTotale += allShow[i].getNbrInscrits() * allShow[i].getTarif();
		}
		System.out.println("la recette total du Theatre est de : " + recetteTotale + "€");
		return recetteTotale;

	}

	public int getNbTotalClients() {
		int clientsTotal = 0;
		for (int i = 0; i <= allShow.length - 1; i++) {
			clientsTotal += allShow[i].getNbrInscrits();
		}
		System.out.println("il y au total : " + clientsTotal + " de personnes inscrites");
		return clientsTotal;
	}

}