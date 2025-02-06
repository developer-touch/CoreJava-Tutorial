package com.java.Encapsulation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BikeRidder {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Bike b1 = new Bike();
		
		try {
			System.out.println("\nChange Gear ::  ");
			b1.setGear(scn.nextInt()); 
			b1.currentGear();
		}
		catch(InputMismatchException e) {
			System.out.println("\nPleasse give gear 1-5 :: ");
			scn.nextLine();
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
