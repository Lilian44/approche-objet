package fr.diginamic.chaines;

import java.util.Arrays;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {
	String chaine = "Durand;Marcel;2 523.5";

	
	public ManipulationChaine() {

		this.chaine = "Durand;Marcel;2 523.5";
	}

	public  void main(String[] args) {
		// TODO Auto-generated method stub
		ManipulationChaine car = new ManipulationChaine();

		char premierCaractere = car.chaine.charAt(0);
		int longueur = car.chaine.length();
		int index = car.chaine.indexOf(';');
		String familyName = car.chaine.substring(0,index);
		String majName = familyName.toUpperCase();
		String minName = familyName.toLowerCase();
		String[] allChar  = car.chaine.split(";");
		System.out.println("Premier caractère: " + premierCaractere);
		System.out.println("Le longueur de la chaine est de: " + longueur);
		System.out.println("Le caractère ; se trouve a l'index: " + index);
		System.out.println("Le nom de famille est : " + familyName);
		System.out.println("Le nom de famille en majuscule est: " + majName);
		System.out.println("Le nom de famille en minuscule est: " + minName);
		System.out.println(Arrays.toString(allChar));
		allChar[2] = allChar[2].replace(" ","");
		double salaire = Double.parseDouble(allChar[2]); 
		Salarie newSalarie = new Salarie(allChar[0],allChar[1],salaire);
		
		System.out.println(newSalarie.toString());
		
		
		
	}
	 
	public String[] split(String str, String c) {
		return str.split(c);
		
	}
	


	public String getChaine() {
		return chaine;
	}

	public void setChaine(String chaine) {
		this.chaine = chaine;
	}



}
