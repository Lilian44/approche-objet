package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		String s = "";
		StringBuilder builder = new StringBuilder();

		long debut = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			builder.append(i);

		}
		String str = builder.toString();

		long fin = System.currentTimeMillis();
		System.out.println("temps écoulé :" +(fin-debut));

	}

}
