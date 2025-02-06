package com.ankit.java.datetime;

import java.time.LocalTime;

public class TimeApiJava8 {
	public static void main(String[] args) {
		System.out.println("TimeApiJava8.main()::main started");
		LocalTime localTime = LocalTime.now();
		System.out.println("Current Time => " + localTime);

		int hour = localTime.getHour();
		System.out.println("Current Hour => " + hour);

		int minutes = localTime.getMinute();
		System.out.println("Current Minutes => " + minutes);

		int seconds = localTime.getSecond();
		System.out.println("Current Seconds => " + seconds);

		int nanoSecond = localTime.getNano();
		System.out.println("Current NanoSeconds => " + nanoSecond);

		System.out.println("TimeApiJava8.main()::main ended");
	}
}
