package fr.diginamic.listes;
import java.util.ArrayList;

public class CreationListe {
public static void main(String[] args) {
	ArrayList<Integer> nbr = new ArrayList<Integer>();
	
	for(int i=1;i<=100;i++) {
		nbr.add(i);
	}
	
	System.out.println(nbr.get(2));
	System.out.println(nbr.size());
	
}
}
