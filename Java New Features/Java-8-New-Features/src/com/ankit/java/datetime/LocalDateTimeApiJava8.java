package com.ankit.java.datetime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class LocalDateTimeApiJava8 {
	public static void main(String[] args) {
		System.out.println("LocalDateTimeApiJava8.main()::main started");

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Current DateRime => " + localDateTime);

		int dayOfMonth = localDateTime.getDayOfMonth();
		System.out.println("DayOfMonth => " + dayOfMonth);

		DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
		System.out.println("DayOfWeek => " + dayOfWeek);

		int dayOfYear = localDateTime.getDayOfYear();
		System.out.println("DayOfYear => " + dayOfYear);

		System.out.println("LocalDateTimeApiJava8.main()::main ended");
	}
}
