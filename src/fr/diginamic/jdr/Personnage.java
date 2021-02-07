package fr.diginamic.jdr;

public class Personnage {
	 private String name;
	 private int force;
	 private int pdv;
	 private int score;

	public Personnage(String name,int force, int pdv) {
		super();
		this.name= name;
		this.force = force;
		this.pdv = pdv;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getPdv() {
		return pdv;
	}

	public void setPdv(int pdv) {
		this.pdv = pdv;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
