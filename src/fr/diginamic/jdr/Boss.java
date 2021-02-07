package fr.diginamic.jdr;

import java.util.Random;

public class Boss {

	private int force;
	private int pdv;

	public Boss(int force, int pdv) {
		super();
		this.force = force;
		this.pdv = pdv;
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

}
