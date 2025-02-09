package com.ankit.java.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTimeBeforeJava8 {
	public static void main(String[] args) throws ParseException {
		System.out.println("DateAndTimeDemoBeforeJava8.main()::main started");
		System.out.println();

		// creating date object
		Date date = new Date();                         
		System.out.println(date);

		// converting date to string
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/mm/yyyy");
		String formatDate1 = simpleDateFormat1.format(date);
		System.out.println("Date => " + formatDate1);

		// converting date to string
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MMM/yyyy");
		String formatDate2 = simpleDateFormat2.format(date);
		System.out.println("Date => " + formatDate2);

		// converting string to date
		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("MM/dd/yyyy");
		Date pareDate = simpleDateFormat3.parse(formatDate1);
		System.out.println(pareDate);

		System.out.println();
		System.out.println("DateAndTimeDemoBeforeJava8.main()::main ended");

	}
}
