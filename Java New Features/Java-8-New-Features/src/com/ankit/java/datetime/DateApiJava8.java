package com.ankit.java.datetime;

import java.time.LocalDate;

public class DateApiJava8 {
	public static void main(String[] args) {
		System.out.println("DateApiJava8.main()::main started");
		// LocalDate class
		LocalDate localDate = LocalDate.now();
		System.out.println("Current Date => " + localDate);

		LocalDate localDay = localDate.plusDays(30);
		System.out.println("After 30 Days => " + localDay);

		LocalDate localMonth = localDate.plusMonths(3);
		System.out.println("After 3 months => " + localMonth);

		LocalDate localWeek = localDate.plusWeeks(3);
		System.out.println("After 3 weeks => " + localWeek);

		LocalDate localYear = localDate.plusYears(3);
		System.out.println("After 3 years => " + localYear);
		
		boolean isLeapYear = LocalDate.parse("2020-12-22").isLeapYear();
		System.out.println("IsLeapYear => "+isLeapYear);
		
		boolean isBefore = LocalDate.parse("2021-12-12").isBefore(LocalDate.parse("2023-03-22"));
		System.out.println("IsBefore => "+isBefore);
		
		System.out.println("DateApiJava8.main()::main ended");
	}
}
