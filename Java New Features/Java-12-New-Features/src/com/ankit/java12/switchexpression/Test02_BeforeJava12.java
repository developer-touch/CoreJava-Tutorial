package com.ankit.java12.switchexpression;

import java.util.Scanner;

public class Test02_BeforeJava12 {
	public static void main(String[] args) {
		System.out.println("Test02_BeforeJava12.main()::strated");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the week number :: ");
		String input = scn.next();
		switch(input) {
		case "Monday" :
		case "Tuesday" :
		case "Wednesday" :
		case "Thursday" :
		case "Friday " :
			System.out.println("Working Day");
			break;
		case "Staturday" :
		case "Sunday" :
			System.out.println("Weekend");
			default :
				System.out.println("Invalid Week Name...");
		}
		System.out.println("Test02_BeforeJava12.main()::ended");
	}
}
