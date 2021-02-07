package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String dateOperation, int montant) {
		super(dateOperation, montant);
		dateOperation = "20/12/20";
		montant = 80;
	}
	
	public String toString() {
		String cred = super.toString();
		return cred ;
	}
	
	 public String afficherType() {
		 return "Crédit";
	 }; 

}
