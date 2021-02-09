package fr.diginamic.testexceptions;

import fr.diginamic.tri.Ville;

public class TestReflectionUtils {
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
		Ville city = new Ville("Nantes",300000);
		
		ReflectionUtils refUtil = new ReflectionUtils();
		try {
			refUtil.afficherAttributs(null);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ReflectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
