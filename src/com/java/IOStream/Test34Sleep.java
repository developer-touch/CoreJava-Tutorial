package com.java.IOStream;

import java.util.Scanner;

public class Test34Sleep {
	public static void main(String[] args) {
		try(Scanner scn = new Scanner(System.in);){
			System.out.println("Enter number :: ");
			int num = scn.nextInt();
			System.out.println("\nTable of " +num);
			for(int i = 1; i<=num; i++) {
				System.out.println(i*num);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
