package fr.diginamic.jdr;

import java.util.Random;

public class Attaques {

	public static void fightLoup(Personnage hero) {
		Random obj = new Random();
		int pdv = obj.nextInt(6) + 5;
		int force = obj.nextInt(6) + 3;
		Loup wolf = new Loup(force, pdv);
		while (wolf.getPdv() > 0 && hero.getPdv() > 0) {
			int blessure = 0;
			int forcePlusWolf = obj.nextInt(10) + 1;
			int forcePlusHero = obj.nextInt(10) + 1;
			if (wolf.getForce() + forcePlusWolf > hero.getForce() + forcePlusHero) {
				blessure = (wolf.getForce() + forcePlusWolf) - (hero.getForce() + forcePlusHero);
				hero.setPdv(hero.getPdv()-blessure);
				System.out.println("Le loup a mordu "+hero.getName());
				if (hero.getPdv() <= 0) {
					System.out.println(hero.getName()+" est mort!");
					System.out.println("Votre score est de "+hero.getScore());
					break;
				}
			} else {
				blessure = (hero.getForce() + forcePlusHero) - (wolf.getForce() + forcePlusWolf);
				wolf.setPdv(wolf.getPdv() - blessure);
				System.out.println(hero.getName()+" a blessé le loup");
				if (wolf.getPdv() <= 0) {
					System.out.println(hero.getName()+" a tuer le loup!");
					hero.setScore(hero.getScore()+1);
					System.out.println("Votre score est maintenant de "+hero.getScore());
					break;
				}
			}
		}

	}

	public static void fightGobelin(Personnage hero) {
		Random obj = new Random();
		int pdv = obj.nextInt(6) + 10;
		int force = obj.nextInt(6) + 5;
		Gobelin gob = new Gobelin(force, pdv);
		while (gob.getPdv() > 0 && hero.getPdv() > 0) {
			int blessure = 0;
			int forcePlusGob = obj.nextInt(10) + 1;
			int forcePlusHero = obj.nextInt(10) + 1;
			if (gob.getForce() + forcePlusGob > hero.getForce() + forcePlusHero) {
				blessure = (gob.getForce() + forcePlusGob) - (hero.getForce() + forcePlusHero);
				hero.setPdv(hero.getPdv()-blessure);
				System.out.println("Le gobelin a blessé "+hero.getName());
				if (hero.getPdv() <= 0) {
					System.out.println(hero.getName()+" est mort!");
					System.out.println("Votre score est de "+hero.getScore());
					break;
				}
			} else {
				blessure = (hero.getForce() + forcePlusHero) - (gob.getForce() + forcePlusGob);
				gob.setPdv(gob.getPdv() - blessure);
				System.out.println(hero.getName()+" a blessé le gobelin");
				if (gob.getPdv() <= 0) {
					System.out.println(hero.getName()+" a tuer le gobelin! Il l'avait mériter");
					hero.setScore(hero.getScore()+2);
					System.out.println("Votre score est maintenant de "+hero.getScore());
					break;
				}
			}
		}

	}

	public static void fightTroll(Personnage hero) {

	}

}
