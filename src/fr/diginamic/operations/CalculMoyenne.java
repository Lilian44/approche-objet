package fr.diginamic.operations;

public class CalculMoyenne {
	double[] arr;

	public CalculMoyenne() {
		super();
		this.arr = arr;

	}

	public double[] getArr() {
		return arr;
	}

	public void setArr(double[] arr) {
		this.arr = arr;
	}

	public void ajout(double nbr) {
		for (int i = 0; i <= arr.length; i++) {
			if (arr[i] == 0) {

				arr[i] = nbr;
			
			}

		}

	}

	public void calcul() {
		double total = 0;
		for (int j = 0; j <= arr.length - 1; j++) {
			total += arr[j];
		}
		System.out.println(total / arr.length);
	}

}
