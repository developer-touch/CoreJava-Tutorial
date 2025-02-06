package com.ankit.java13.switchexpression;

public class Test02_BeforeJava13 {
	public static void getMonthsName(int monthskNumber) {
		System.out.println("Test02_BeforeJava13.getMonthsName()");
		switch (monthskNumber) {
		case 1 -> System.out.println("January");
		case 2 -> System.out.println("February");
		case 3 -> System.out.println("March");
		case 4 -> System.out.println("April");
		case 5 -> System.out.println("May");
		case 6 -> System.out.println("June");
		case 7 -> System.out.println("July");
		case 8 -> System.out.println("August");
		case 9 -> System.out.println("September");
		case 10 -> System.out.println("October");
		case 11-> System.out.println("November");
		case 12-> System.out.println("December");
		default -> throw new IllegalArgumentException("Invalid months number");
		}
	}
	public static void main(String[] args) {
		System.out.println("Test01_BeforeJava13.main()::started");
		Test02_BeforeJava13.getMonthsName(14);
		System.out.println("Test01_BeforeJava13.main()::ended");
	}
}
