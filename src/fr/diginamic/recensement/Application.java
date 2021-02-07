package fr.diginamic.recensement;

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
		System.out.println(Integer.parseInt(allCities.get(15).getCodeDepartement()));

		System.out.println("Bonjour, Que voulez vous faire ?\n" + "1) Population d'une ville au choix \n"
				+ "2) Populaion d'un département au choix\n" + "3) Population d'une région au choix\n"
				+ "4) Afficher les 10 régions les plus peuplées\n"
				+ "5) Afficher les 10 départements les plus peuplés\n"
				+ "6) Afficher les 10 villes les plus peuplées d’un département\n"
				+ "7) Afficher les 10 villes les plus peuplées d’une région\n"
				+ "8) Afficher les 10 villes les plus peuplées de France\n" + "9) Sortir");
		Scanner scanner = new Scanner(System.in);
		int choix = scanner.nextInt();

		switch (choix) {
		case 1: {
			System.out.println("Entrez le nom d'une ville :");
			Scanner scan = new Scanner(System.in);
			String city = scan.nextLine();
			Rechercher search = new Rechercher();
			search.traiter(allCities, city);
			break;

		}
		case 2: {
			System.out.println("Entrez le numéro d'un département :");
			Scanner scan = new Scanner(System.in);
			String dpt = scan.nextLine();
			HabitantDprtmt search = new HabitantDprtmt();
			search.traiter(allCities,dpt);
			break;
		}
		case 3: {
			System.out.println("Entrez le numéro d'une région :");
			Scanner scan = new Scanner(System.in);
			String rgn = scan.nextLine();
			HabitantRegion search = new HabitantRegion();
			search.traiter( allCities,rgn);
			break;

		}
		case 4: {
			RegionTopTen top = new RegionTopTen();
			top.traiter(allCities,null);
			break;

		}
		case 5: {
			DepartementTopTen topD = new DepartementTopTen();
			topD.traiter(allCities,null);
			break;
		}
		case 6: {
			System.out.println("Choisissez un code département :");
			Scanner scan = new Scanner(System.in);
			String dptmt = scan.nextLine();
			TopCitiesDep searchBigCityDptmt = new TopCitiesDep();
			searchBigCityDptmt.traiter(allCities, dptmt);
			break;

		}
		case 7: {
			System.out.println("Choisissez un code Région :");
			Scanner scan = new Scanner(System.in);
			String rgn = scan.nextLine();
			TopCitiesRegion searchBigCitiesRgn = new TopCitiesRegion();
			searchBigCitiesRgn.traiter(allCities, rgn);
			break;

		}
		case 8: {
			
			TopCitiesPays topFrance = new TopCitiesPays();
			topFrance.traiter(allCities, null);
			break;

		}
		case 9: {
			System.out.println("Au revoir! :)");
			break;
		}
		default:
			break;
		}

	}

}
