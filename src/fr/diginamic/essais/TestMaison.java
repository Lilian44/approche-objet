package fr.diginamic.essais;

import fr.diginamic.maison.*;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;

public class TestMaison {
	public static void main(String[] args) {

		Chambre ch = new Chambre(14, 0);
		Cuisine cui = new Cuisine(12,1);
		Chambre ch2 = new Chambre(14, 0);
		

		Piece[] test = {ch,cui,ch2};



		Maison littleHome = new Maison(test);
//		littleHome.getSuperficieTotale();
//		littleHome.superficieEtage(0);
		littleHome.ajouterPiece(cui);
		
		littleHome.superfSpecificPiece("chambre");
		littleHome.nbrTypePiece("chambre");
	}
}
