/**
 * 
 */
package utils;

/**
 * @author lguep
 *
 */
public class ConversionNombre {

	public String chaine = "12";
	public int result;
	public int a;
	public int b;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConversionNombre n = new ConversionNombre();
		n.result = Integer.parseInt(n.chaine);
		System.out.println(n.result);
	}

}
