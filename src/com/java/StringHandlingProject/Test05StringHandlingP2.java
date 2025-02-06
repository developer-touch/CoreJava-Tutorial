package com.java.StringHandlingProject;

import java.util.Scanner;

public class Test05StringHandlingP2 {
	public static void main(String[] args) {
		try(Scanner scn = new Scanner(System.in);){
			System.out.println("Enter Your Name :: ");
			String name = scn.nextLine();
			
			if(name.isBlank() || name.isEmpty()) {
				System.out.println("Please enter your name");
			}
			else {
				System.out.println("Your name has " +name.length()+" character");
			}
		}
	}
}
