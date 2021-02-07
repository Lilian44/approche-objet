package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String dateOperation, int montant) {
		super(dateOperation, montant);
		dateOperation = "20/12/20";
		montant = 80;
		
	}
	
	public String toString() {
		String deb = super.toString();
		return deb ;
		
	}
	
	 public String afficherType() {
		 return "Débit";
	 }; 
	
	
	
	
}
