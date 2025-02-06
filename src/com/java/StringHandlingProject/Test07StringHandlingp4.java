package com.java.StringHandlingProject;

import java.util.Scanner;

public class Test07StringHandlingp4 {
	public static void main(String[] args) {
		try(Scanner scn = new Scanner(System.in);){
			System.out.println("Enter your number :: ");
			String number = scn.nextLine();
			long length = (long)number.length();
			
			if(length==10) {
				System.out.println("Valid phone number");
			}
			else {
				System.out.println("Number must be 10 digit");
			}
		}
	}
}
