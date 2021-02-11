package fr.diginamic.testenumeration;

public class TestEnumeration {
	public static void main(String[] args) {

		Saison[] season = Saison.values();
		for (Saison s : season) {

			System.out.println(s.getNom());
		}
		String nom = "ETE";
		int libel = 1;
		System.out.println("Saison associée au nom : " + Saison.valueOf(nom).getLibel());
	}

}
