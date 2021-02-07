package fr.diginamic.fichier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/workspace/approche-objet/src/fr/diginamic/fichier/recensement.csv");

		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		List<String> lines2 = new ArrayList<>();
		for (int i = 1; i < lines.size(); i++) {
			String[] arr = lines.get(i).split(";");

			if (Integer.parseInt(arr[9].replaceAll(" ", "")) > 25000) {
				Collections.addAll(lines2, arr[6] + ";" + arr[2] + ";" + arr[9]);
			}
		}

		Path pathCible = Paths.get("C:/workspace/approche-objet/src/fr/diginamic/fichier/cible.csv");
		Files.write(pathCible, lines2);
	}
}
