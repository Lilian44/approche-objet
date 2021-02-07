/**
 * 
 */
package entities;

/**
 * @author lguep
 *
 */
public class AdressePostale {
	public int numeroRue;
	public String libelleRue;
	public int codePostal;
	public String ville;
	
	public AdressePostale(int rue, String nameRue, int code,String city ) {
		// TODO Auto-generated constructor stub
		numeroRue = rue;
		libelleRue = nameRue;
		codePostal = code;
		ville = city;
	}

	public int getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getLibelleRue() {
		return libelleRue;
	}

	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * @param args
	 */

}
