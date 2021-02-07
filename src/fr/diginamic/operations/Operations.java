package fr.diginamic.operations;

public class Operations {
	double a;
	double b;
	char c;

	public Operations(double a, double b,char c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double calcul1(double a, double b, char c) {
		double calc=0;
		if (c == '+') {
			 calc = a + b;
		}
		if (c == '-')
		{
			calc = a - b;
		}
		return calc;
	}
	
	public double calcul2(double a, double b, char c) {
		double calc=0;
		if (c == '*') {
			 calc = a * b;
		}
		if (c == '/')
		{
			calc = a / b;
		}
		return calc;
	}

}
