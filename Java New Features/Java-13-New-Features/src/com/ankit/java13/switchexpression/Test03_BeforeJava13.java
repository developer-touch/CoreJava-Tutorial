package com.ankit.java13.switchexpression;

public class Test03_BeforeJava13 {
	public static void getSeasonName(int monthskNumber) {
		System.out.println("Test03_BeforeJava13.getMonthsName()");
		switch (monthskNumber) {
		case 12,1,2,3-> System.out.println("Winter Season");
		case 4,5,6,7 -> System.out.println("Summer Season");
		case 8,9,10,11 -> System.out.println("Rainy Season");
		default -> throw new IllegalArgumentException("Invalid months number");
		}
	}
	public static void main(String[] args) {
		System.out.println("Test01_BeforeJava13.main()::started");
		Test03_BeforeJava13.getSeasonName(4);
		System.out.println("Test01_BeforeJava13.main()::ended");
	}
}
