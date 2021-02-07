package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeInt {
	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(-1);
		arr.add(5);
		arr.add(7);
		arr.add(3);
		arr.add(-2);
		arr.add(4);
		arr.add(8);
		arr.add(5);

		for (int i = 0; i <= arr.size() - 1; i++) {
			System.out.print(arr.get(i) + " ");
		}

		System.out.println("\n" + arr.size());

		int biggest = 0;
		for (int i = 0; i < arr.size() - 1; i++) {

			if (arr.get(i) > arr.get(i + 1)) {
				biggest = arr.get(i);
			}
		}
		System.out.println(biggest);

		int shortest = 0;
		for (int j = 0; j < arr.size() - 1; j++) {

			if (arr.get(j) < arr.get(j + 1)) {
				shortest = arr.get(j);
			}
		}
		System.out.println(arr.get(shortest));
		arr.remove(arr.get(shortest));
		System.out.println(arr);

		for (int j = 0; j < arr.size() - 1; j++) {

			if (arr.get(j) < 0) {
				arr.set(j, Math.abs(arr.get(j)));
			}
		}
		System.out.println(arr);

	}

}
