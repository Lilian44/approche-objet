package fr.diginamic.objetGeometrique;

public class TestObjetGeometrique {

	public static void main(String[] args) {

		ObjetGeometrique[] arr = new ObjetGeometrique[2];

		Rectangle rec1 = new Rectangle(10, 5);
		Cercle cer1 = new Cercle(5);
		arr[0] = cer1;
		arr[1] = rec1;
		
		for(int i =0; i<=arr.length-1;i++) {
			System.out.println(arr[i].perimetre());
			System.out.println(arr[i].surface());
		}

	}

}
