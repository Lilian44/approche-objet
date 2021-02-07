package fr.diginamic.jdr;

import java.util.Random;
import java.util.Scanner;

public class Start {
	public static void main(String[] args) {

		System.out.println("Veuillez entrez un nom pour votre personnage \n");
		Scanner scanner = new Scanner(System.in);
		String perso = scanner.nextLine();
		createPerso(perso);

	}

	public static void createPerso(String perso) {
		Random obj = new Random();
		int force = obj.nextInt(6) + 13;
		int pdv = obj.nextInt(30) + 21;

		Personnage player = new Personnage(perso, force, pdv);
		System.out.println(player.name + " a " + player.force + "points de force et " + player.pdv + " points de vie");
		play(player);

	}

	public static void play(Personnage hero) {
		while (hero.pdv > 0) {
			System.out.println("choisisez votre ennemi : ");
			Scanner scanner = new Scanner(System.in);
			String perso = scanner.nextLine();

			switch (perso) {
			case "loup": {

				Attaques.fightLoup(hero);
			}
			case "gobelin": {

				Attaques.fightGobelin(hero);
			}
			case "troll": {

				Attaques.fightTroll(hero);
			}
			default:
				break;
			}
//			System.out.println(hero.score);
		}

	}
}
