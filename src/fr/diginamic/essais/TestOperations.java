package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
	public static void main(String[] args) {
		Operations add = new Operations(2,2,'+');
		double result = add.calcul1(4,2,'+');
		System.out.println(result);
		
		Operations sous = new Operations(10,2,'-');
		double result2 = sous.calcul1(10,2,'-');
		System.out.println(result2);
		
		
		Operations div = new Operations(10,3,'/');
		double result3 = div.calcul2(10,3,'/');
		System.out.println(result3);
		
		Operations mult = new Operations(10,3,'*');
		double result4 = mult.calcul2(10,3,'*');
		System.out.println(result4);
		
		
	}

}
