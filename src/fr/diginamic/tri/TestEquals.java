package fr.diginamic.tri;

public class TestEquals {
	public static void main(String[] args) {

		Ville v1 = new Ville("Nantes", 300000);
		Ville v2 = new Ville("Nantes", 300000);

		if (v1.equals(v2)) {

			System.out.println("identiques");

		} else {
			System.out.println("différentes");
		}

	}

}
