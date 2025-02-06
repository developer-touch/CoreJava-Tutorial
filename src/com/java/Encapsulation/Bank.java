package com.java.Encapsulation;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		
		BankAccount ac = new BankAccount();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the balance ::");
		
		try {
			ac.setBalance(scn.nextDouble());
			System.out.println(ac.toString());
		}
		catch(Exception e){
			System.out.println("\nPlease Enter valid balance");
		}
		
	}
}
