/**
 * 
 */
package entities;

/**
 * @author lguep
 *
 */
public class Personne {
	public String name;
	public String prenom;
	public AdressePostale adressePostale;
	
	

	public Personne(String name, String prenom) {
		this.name = name;
		this.prenom = prenom;
	}
	
	public Personne(String name, String prenom, AdressePostale adressePostale) {
		this.name = name;
		this.prenom = prenom;
		this.adressePostale= adressePostale;
	}
	
	public String maj(String name, String prenom) {
	
		String majPrenom= name.toUpperCase();
		String majComplet = prenom +" "+ majPrenom;
;		return majComplet ;
	}
	
	public void changeName(String name) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public AdressePostale getAdressePostale() {
		return adressePostale;
	}

	public void setAdressePostale(AdressePostale adressePostale) {
		this.adressePostale = adressePostale;
	}

	/**
	 * @param args
	 */

}
