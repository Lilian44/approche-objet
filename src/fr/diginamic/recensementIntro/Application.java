package fr.diginamic.recensementIntro;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/workspace/approche-objet/src/fr/diginamic/recensement/recensement.csv");
		ArrayList<Ville> allCities = new ArrayList<>();

		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

		for (int i = 1; i < lines.size(); i++) {
			String[] arr = lines.get(i).split(";");

			Collections.addAll(allCities,
					new Ville(arr[0], arr[1], arr[2], arr[5], arr[6], Integer.parseInt(arr[9].replaceAll(" ", ""))));

		}

//		System.out.println("Bonjour, Que voulez vous faire ?\n" + "1) Population d'une ville au choix \n"
//				+ "2) Populaion d'un département au choix\n" + "3) Population d'une région au choix\n"
//				+ "4) Afficher les 10 régions les plus peuplées\n"
//				+ "5) Afficher les 10 départements les plus peuplés\n"
//				+ "6) Afficher les 10 villes les plus peuplées d’un département\n"
//				+ "7) Afficher les 10 villes les plus peuplées d’une région\n"
//				+ "8) Afficher les 10 villes les plus peuplées de France\n" + "9) Sortir");
//		Scanner scanner = new Scanner(System.in);
//		int choix = scanner.nextInt();

//		switch (choix) {
//		case 1: {
//			Scanner scan = new Scanner(System.in);
//			String city = scan.nextLine();
//			Rechercher search = new Rechercher(city);
//			search.search(city, allCities);
//
//		}
//		case 2: {
//			Scanner scan = new Scanner(System.in);
//			String dpt = scan.nextLine();
//			HabitantDprtmt search = new HabitantDprtmt();
//			search.NbrHabitantDprtmt(dpt, allCities);
//		}
//		case 3: {
//			Scanner scan = new Scanner(System.in);
//			String rgn = scan.nextLine();
//			HabitantRegion search = new HabitantRegion();
//			search.NbrHabitantRegion(rgn, allCities);
//
//		}
//		case 4: {
//			RegionTopTen top = new RegionTopTen();
//			top.TopTen(allCities);
//
//		}
//		case 5: {
//
//		}
//		case 6: {
//
//		}
//		case 7: {
//
//		}
//		case 8: {
//
//		}
//		case 9: {
//			System.out.println("Au revoir! :)");
//			break;
//		}
//		default:
//			break;
//		}

		Montpellier infos = new Montpellier(allCities);
		infos.afficherMontpellier(allCities);

		PopulationHérault pop = new PopulationHérault();
		pop.Population(allCities);

		pop.plusPetiteVille(allCities);

		pop.biggestCities(allCities);
		
		pop.smallestCities(allCities);
		
		Occitanie pocc = new Occitanie();
		pocc.populationOccitanie(allCities);
		pocc.topTen(allCities);
		
		BiggestDepartmentOccitanie occi = new BiggestDepartmentOccitanie();
		occi.Departements(allCities);
		
		TopTenRegion topR= new TopTenRegion();
		topR.topTen(allCities);
		
		TopTenDepartement topD= new TopTenDepartement();
		topD.topTen(allCities);
		

	}

}
