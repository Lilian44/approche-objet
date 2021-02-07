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

		AdressePostale a1 = new AdressePostale(5, "rue de canal", 44160, "blabla");
		Personne people1 = new Personne("Guépin", "Lilian");
		Personne people2 = new Personne("Guépin", "Lilian", a1);
		Personne majPeople = new Personne("Guépin", "Lilian");
		String maj= majPeople.maj("Lilian", "Lilian");
		System.out.println(maj);

		
		people1.setPrenom("STéphanie");
		System.out.println(people1.prenom);
		
		people2.setAdressePostale(new AdressePostale(1, "rue blabla", 44200, "nantes"));
		
	}

}
