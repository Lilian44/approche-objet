package fr.diginamic.jdr;

import java.util.Random;

public class Attaques {

	public static void fightLoup(Personnage hero) {
		Random obj = new Random();
		int force = obj.nextInt(6) + 3;
		int pdv = obj.nextInt(6) + 5;
		Loup wolf = new Loup(force, pdv);
		while (wolf.pdv > 0 && hero.pdv > 0) {
			int blessure = 0;
			int forcePlusWolf = obj.nextInt(10) + 1;
			int forcePlusHero = obj.nextInt(10) + 1;
			if (wolf.force + forcePlusWolf > hero.force + forcePlusHero) {
				blessure = (wolf.force + forcePlusWolf) - (hero.force + forcePlusHero);
				hero.pdv -= blessure;
				if(hero.pdv <=0) {
					System.out.println("Vous êtes mort!");
					break;
				}
			} else {
				blessure = (hero.force + forcePlusHero)-(wolf.force + forcePlusWolf);
				wolf.pdv-= blessure;
				if(wolf.pdv <=0) {
					System.out.println("Vous avez tuer le loup!");
					hero.score ++;
					break;
				}
			}
		}
		

	}

	public static void fightGobelin(Personnage hero) {

	}

	public static void fightTroll(Personnage hero) {

	}

}
