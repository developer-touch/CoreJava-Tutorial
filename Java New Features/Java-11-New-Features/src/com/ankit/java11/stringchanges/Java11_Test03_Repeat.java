package com.ankit.java11.stringchanges;

import java.util.Scanner;

public class Java11_Test03_Repeat {
	public static void main(String[] args) {
		System.out.println("Java11_Test03_Repeat.main()");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = scanner.nextLine();
		
		System.out.println("Enter a repeat count");
		int repeatCount = scanner.nextInt();
		
		/**
		 *  This method used to repeat or duplicate the given string
		 */
		System.out.println(input.repeat(repeatCount));
	}
}
