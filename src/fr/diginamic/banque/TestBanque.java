package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compte c = new Compte( "A0010",125.0);
//		System.out.print(c);
	
		
		
		
		CompteTaux c2 = new CompteTaux("A0010",125.0, 1.0);
		System.out.print(c2+"\n\n");
		
		
		Compte [] arr = new Compte[2];
		arr[0]= c;
		arr[1]=c2;
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
	}



}
