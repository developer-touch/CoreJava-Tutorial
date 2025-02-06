package com.ankit.java.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTimeAfterJava8 {
	public static void main(String[] args) {
		System.out.println("DateAndTimeAfterJava8.main()::main started");
		
		// LocalDate class
		LocalDate localDate = LocalDate.now();
		System.out.println("Current Date => " + localDate);
		
		//LocalTime class
		LocalTime localTime = LocalTime.now();
		System.out.println("Current Time => "+localTime);
		
		//LocalDateTime class
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Current Date And Time => "+localDateTime);
		
		System.out.println("DateAndTimeAfterJava8.main()::main ended");
	}
}
