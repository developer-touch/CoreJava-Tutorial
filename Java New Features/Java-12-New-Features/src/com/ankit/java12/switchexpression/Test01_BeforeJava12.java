package com.ankit.java12.switchexpression;

import java.util.Scanner;

public class Test01_BeforeJava12 {
	public static void main(String[] args) {
		System.out.println("Test01_BeforeJava12.main()::strated");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the week number :: ");
		int input = scn.nextInt();
		switch(input) {
			case 1: 
				System.out.println("monday");
				break;
			case 2: 
				System.out.println("tuesday");
				break;
			case 3: 
				System.out.println("wednesday");
				break;
			case 4: 
				System.out.println("thursday");
				break;
			case 5: 
				System.out.println("friday");
				break;
			case 6: 
				System.out.println("saturday");
				break;
			case 7: 
				System.out.println("sundat");
				break;
			default :
				System.out.println("Invalid Number..please enter 1-7");
		}
		System.out.println("Test01_BeforeJava12.main()::ended");
	}
}
