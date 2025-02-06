package com.ankit.java12.switchexpression;

import java.util.Scanner;

public class Test01_FromJava12 {
	public static void main(String[] args) {
		System.out.println("Test01_FromJava12.main()::strated");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the week number :: ");
		String input = scn.next();
		switch (input) {
		case "monday","tuesday","wednesday","thursday","friday" -> System.out.println("working day");
		case "saturday", "sunday" -> System.out.println("weeked day");
		default -> System.out.println("Invalid week name");
		}
		System.out.println("Test01_FromJava12.main()::ended");
	}
}
