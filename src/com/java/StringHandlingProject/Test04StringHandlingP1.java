package com.java.StringHandlingProject;

import java.util.Scanner;

public class Test04StringHandlingP1 {
	public static void main(String[] args) {
		try(Scanner scn = new Scanner(System.in)){
			System.out.println("Enter the user name ::");
			String uname = scn.nextLine();
			
			if(uname.isEmpty() || uname.isBlank()) {
				System.out.println("Enter Username");
			}
			else {
				System.out.println("Welcome to NIT");
			}
		}
	}
}
