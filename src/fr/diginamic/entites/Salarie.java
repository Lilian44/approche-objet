package fr.diginamic.entites;

import fr.diginamic.chaines.ManipulationChaine;

public class Salarie {
	String name;
	String prenom;
	double salaire;

	public Salarie(String name, String prenom, double salaire) {
		super();
		this.name = name;
		this.prenom = prenom;
		this.salaire = salaire;
	}

	public static void main(String[] args) {

		ManipulationChaine test = new ManipulationChaine();
		String [] arr = test.split(test.getChaine(), ";");
		arr[2] = arr[2].replace(" ","");
		double salaire = Double.parseDouble(arr[2]); 
		Salarie newSalarie = new Salarie(arr[0],arr[1],salaire);
		

		System.out.print("nom: "+newSalarie.name+"\nprenom: "+newSalarie.prenom+"\nsalaire: "+newSalarie.salaire);
		

	}

	@Override
	public String toString() {
		return "Salarie [name=" + name + ", prenom=" + prenom + ", salaire=" + salaire + "]";
	}



}
