package fr.diginamic.dates;

import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestCalendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 4, 19);
		Date date = cal.getTime();
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formateur.format(date));

		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		System.out.println(format.format(calendar.getTime()));

		SimpleDateFormat format2 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss");
		System.out.println(format2.format(calendar.getTime()));

		SimpleDateFormat format3 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.CHINESE);
		System.out.println(format3.format(calendar.getTime()));
		
		SimpleDateFormat format4 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.GERMAN);
		System.out.println(format4.format(calendar.getTime()));
		
		SimpleDateFormat format5 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss",new  Locale("ru", "RU"));
		System.out.println(format5.format(calendar.getTime()));
		

	}
}
