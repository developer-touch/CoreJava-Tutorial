package com.java.StringHandlingProject;

import java.util.Scanner;

public class Test10StringHandlingp7 {
	public static void main(String[] args) {
		try(Scanner scn = new Scanner(System.in);){
			System.out.println("Enter your username :: ");
			String username = scn.nextLine();
			
			System.out.println("Enter your password :: ");
			String password = scn.nextLine();
			
			if(username=="Ankit" && password == "Nit#1") {
				System.out.println("Valid username and password");
			}
			else {
				System.out.println("Invlid username or password");
			}
		}
	}
}
