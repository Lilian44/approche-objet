package fr.diginamic.essais;

import fr.diginamic.salaire.Salarie;
import fr.diginamic.salaire.Pigiste;

public class TestIntervenant {
	public static void main(String[] args) {

		Salarie salarie1 = new Salarie("Lilian", "Guépin", 1500.0);
		Pigiste pigiste1 = new Pigiste("Lilian", "Guépin",5,20.0);
		salarie1.getSalaire();
		pigiste1.getSalaire();
	}
}
