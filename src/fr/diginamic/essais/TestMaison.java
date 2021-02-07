package fr.diginamic.essais;

import fr.diginamic.maison.*;
import fr.diginamic.maison.Maison;


public class TestMaison {
	public static void main(String[] args) {

		Chambre ch = new Chambre(14, 0);
		Cuisine cui = new Cuisine(12,1);
		Chambre ch2 = new Chambre(14, 0);
		

		Maison littleHome = new Maison();
//		littleHome.getSuperficieTotale();
//		littleHome.superficieEtage(0);
		littleHome.ajouterPiece(cui);
		littleHome.ajouterPiece(ch);
		littleHome.ajouterPiece(ch2);
		
		littleHome.superfSpecificPiece("chambre");
		littleHome.nbrTypePiece("chambre");
	}
}
