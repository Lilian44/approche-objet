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
public class TestAdressePostale {

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
		
	}

}
