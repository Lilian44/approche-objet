package fr.diginamic.recensement;

import java.util.ArrayList;

/** 
 * Classe mère des options du menu.
 * 
 */

public abstract class MenuService {
	
	
	public abstract void traiter(ArrayList<Ville> cities, String scan );
	

}
