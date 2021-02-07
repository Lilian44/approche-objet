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
				hero.setPdv(hero.getPdv() - blessure);
				System.out.println(ANSI_RED+"Le loup a mordu " + hero.getName()+ ANSI_RESET);
				if (hero.getPdv() <= 0) {
					System.out.println(ANSI_RED+hero.getName() + " est mort!"+ ANSI_RESET);
					System.out.println("Votre score est de " + hero.getScore());
					break;
				}
			} else {
				blessure = (hero.getForce() + forcePlusHero) - (wolf.getForce() + forcePlusWolf);
				wolf.setPdv(wolf.getPdv() - blessure);
				System.out.println(hero.getName() + " a blessé le loup");
				if (wolf.getPdv() <= 0) {
					System.out.println(hero.getName() + " a tuer le loup!");
					hero.setScore(hero.getScore() + 1);
					System.out.println("Votre score est maintenant de " + hero.getScore());
					break;
				}
			}
		}
		if (hero.getScore() >= 10 && hero.getScore() < 15) {
			boss(hero);
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
				hero.setPdv(hero.getPdv() - blessure);
				System.out.println(ANSI_RED+"Le gobelin a blessé " + hero.getName()+ ANSI_RESET);
				if (hero.getPdv() <= 0) {
					System.out.println(ANSI_RED+hero.getName() + " est mort!"+ ANSI_RESET);
					System.out.println("Votre score est de " + hero.getScore());
					break;
				}
			} else {
				blessure = (hero.getForce() + forcePlusHero) - (gob.getForce() + forcePlusGob);
				gob.setPdv(gob.getPdv() - blessure);
				System.out.println(hero.getName() + " a blessé le gobelin");
				if (gob.getPdv() <= 0) {
					System.out.println(hero.getName() + " a tuer le gobelin! Il l'avait mériter");
					hero.setScore(hero.getScore() + 2);
					System.out.println("Votre score est maintenant de " + hero.getScore());
					break;
				}
			}
		}
		if (hero.getScore() >= 10 && hero.getScore() < 15) {
			boss(hero);
		}

	}

	public static void fightTroll(Personnage hero) {
		Random obj = new Random();
		int pdv = obj.nextInt(11) + 20;
		int force = obj.nextInt(6) + 10;
		Troll troll = new Troll(force, pdv);
		while (troll.getPdv() > 0 && hero.getPdv() > 0) {
			int blessure = 0;
			int forcePlusTroll = obj.nextInt(10) + 1;
			int forcePlusHero = obj.nextInt(10) + 1;
			if (troll.getForce() + forcePlusTroll > hero.getForce() + forcePlusHero) {
				blessure = (troll.getForce() + forcePlusTroll) - (hero.getForce() + forcePlusHero);
				hero.setPdv(hero.getPdv() - blessure);
				System.out.println(ANSI_RED+"Le troll a blessé " + hero.getName()+ ANSI_RESET);
				if (hero.getPdv() <= 0) {
					System.out.println(ANSI_RED+hero.getName() + " est mort!"+ ANSI_RESET);
					System.out.println("Votre score est de " + hero.getScore());
					break;
				}
			} else {
				blessure = (hero.getForce() + forcePlusHero) - (troll.getForce() + forcePlusTroll);
				troll.setPdv(troll.getPdv() - blessure);
				System.out.println(hero.getName() + " a blessé le Troll");
				if (troll.getPdv() <= 0) {
					System.out.println(hero.getName() + " a tuer le troll! Il l'avait mériter");
					hero.setScore(hero.getScore() + 5);
					System.out.println("Votre score est maintenant de " + hero.getScore());
					break;
				}
			}
		}
		if (hero.getScore() >= 10 && hero.getScore() < 15) {
			boss(hero);
		}

	}
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RESET = "\u001B[0m";
	public static void boss(Personnage hero) {
		System.out.println(ANSI_RED+"\n ATTENTION !! Un Dragon apparait derrière vous !!\n "+ ANSI_RESET);
		Random obj = new Random();
		int pdv = obj.nextInt(11) + 35;
		int force = obj.nextInt(6) + 15;
		Boss boss = new Boss(force, pdv);
		while (boss.getPdv() > 0 && hero.getPdv() > 0) {
			int blessure = 0;
			int forcePlusBoss = obj.nextInt(10) + 1;
			int forcePlusHero = obj.nextInt(10) + 1;
			if (boss.getForce() + forcePlusBoss > hero.getForce() + forcePlusHero) {
				blessure = (boss.getForce() + forcePlusBoss) - (hero.getForce() + forcePlusHero);
				hero.setPdv(hero.getPdv() - blessure);
				System.out.println(ANSI_RED+"Le dragon a blessé " + hero.getName()+ ANSI_RESET);
				if (hero.getPdv() <= 0) {
					System.out.println(ANSI_RED+hero.getName() + " est mort!"+ ANSI_RESET);
					System.out.println("Votre score est de " + hero.getScore());
					break;
				}
			} else {
				blessure = (hero.getForce() + forcePlusHero) - (boss.getForce() + forcePlusBoss);
				boss.setPdv(boss.getPdv() - blessure);
				System.out.println(hero.getName() + " a blessé le dragon");
				if (boss.getPdv() <= 0) {
					System.out.println(hero.getName() + " a tuer le dragon! Une bonne chose de faite"+ ANSI_RESET);
					hero.setScore(hero.getScore() + 10);
					System.out.println("Votre score est maintenant de " + hero.getScore());
					break;
				}
			}
		}

	}

}
