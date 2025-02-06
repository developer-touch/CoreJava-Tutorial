package com.ankit.java12.switchexpression;

import java.util.Scanner;

public class Test03_FromJava12 {
	public static void main(String[] args) {
		System.out.println("Test03_FromJava12.main()::strated");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the months number :: ");
		int input = scn.nextInt();
		switch (input) {
		case 1,2,3,12 -> System.out.println("Winter Season");
		case 4,5,6,7-> System.out.println("Summer Season");
		case 8,9,10,11-> System.out.println("Rainy Season");
		default -> System.out.println("Invalid mobths number");
		}
		System.out.println("Test03_FromJava12.main()::ended");
	}
}
