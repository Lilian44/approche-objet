package fr.diginamic.parseur;

import java.util.Iterator;

public class Parser {

	public Expression parse(String str) {

		String[] arr = str.split("");
		Expression exp = new Expression(arr[0], arr[1], arr[2]);
		return exp;

	}

}
