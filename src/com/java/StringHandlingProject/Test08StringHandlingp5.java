package com.java.StringHandlingProject;

import java.util.Scanner;

public class Test08StringHandlingp5 {
	public static void main(String[] args) {
		try(Scanner scn = new Scanner(System.in);){
			System.out.println("Enter your name");
			String name = scn.nextLine();
			
			System.out.println("Hi "+name + "\nyour name has "+name.length()+" character");
		}
	}
}
