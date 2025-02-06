package com.java.StringHandlingProject;

import java.util.Scanner;

public class Test06StringHandlingP3 {
	public static void main(String[] args) {
		try(Scanner scn = new Scanner(System.in);){
			System.out.println("Enter Your Password :: ");
			String pwd = scn.nextLine();
			
			int pwdLength = pwd.length();
			
			if(pwdLength>8 && pwdLength<16) {
				System.out.println("Valid Password");
			}
			else {
				System.out.println("Password length must be in 8 to 16");
			}
			
		}
	}
}
