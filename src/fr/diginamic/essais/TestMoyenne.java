package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne extends CalculMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double[] arrTest = { 1.2, 2.0, 4.5, 10.0 };
	
		CalculMoyenne test = new CalculMoyenne();
		test.setArr(arrTest);
		test.calcul();
		
		double[] arrTest2 = { 10.0, 10.0, 10.0, 10.0 };
		test.setArr(arrTest2);
		test.calcul();

	}

}
