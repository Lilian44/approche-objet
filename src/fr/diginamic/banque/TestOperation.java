package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;
import fr.diginamic.banque.entites.Compte;

public class TestOperation {

	public static void main(String[] args) {

		Operation[] opes = new Operation[4];
		
		Debit deb1 = new Debit("20/12/2020", 500);
		Debit deb2 = new Debit("28/12/2020", 20);
		Credit cred1 = new Credit("20/12/2020", 120);
		Credit cred2 = new Credit("28/12/2020", 20);
		Compte d = new Compte("A0010", 125.0);
		

		double soldee = 0;

		
		opes[0] = deb1;
		opes[1] = deb2;
		opes[2] = cred1;
		opes[3] = cred2;

		for (int i = 0; i <= opes.length - 1; i++) {
			System.out.println(opes[i].afficherType());
			System.out.print(opes[i] + "\n");
			if (opes[i].afficherType() == "Débit") {
				soldee += opes[i].getMontant();
				System.out.println(soldee);
			}
		}
	}

}
