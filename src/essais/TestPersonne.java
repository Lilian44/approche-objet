/**
 * 
 */
package essais;

import entities.AdressePostale;
import entities.Personne;

/**
 * @author lguep
 *
 */
public class TestPersonne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale ap1 = new AdressePostale();
		ap1.numeroRue = 5;
		ap1.libelleRue = "des Maréchaux";
		ap1.codePostal = 44100;
		ap1.ville = "Nantes";
		
		AdressePostale ap2 = new AdressePostale();
		ap2.numeroRue = 85;
		ap2.libelleRue = "d’Antrain";
		ap2.codePostal = 35700;
		ap2.ville = "Rennes";
		
		Personne people1 = new Personne();
		people1.name = "Guépin";
		people1.prenom = "Lilian";
		people1.adressePostale =ap1;
		
		Personne people2 = new Personne();
		people1.name = "Bernard";
		people1.prenom = "Dupont";
		people1.adressePostale =ap2;
		
	}

}
