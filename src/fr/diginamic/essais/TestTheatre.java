package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre show = new Theatre("theatre", 50);

		show.inscrire(45, 15);

		show.inscrire(4, 15);
		show.inscrire(1, 15);
		show.inscrire(2, 15);

//		Theatre show2 = new Theatre("test", 50,20, 10 );
//		
//		show2.inscrire(50, 15);
	}

}
