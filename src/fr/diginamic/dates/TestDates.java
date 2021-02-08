package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(date));
		Date date2 = new Date(116, 4, 19, 23, 59, 30);
		System.out.println(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(date2));
		Date date3 = new Date();
		System.out.println(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(date3));

	}
}
