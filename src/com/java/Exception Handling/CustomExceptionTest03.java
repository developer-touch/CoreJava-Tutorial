package com.java.ExceptionHandling;
import java.util.Scanner;

class CustomTestMain{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		CustomTest ct = new CustomTest();
		try{
			System.out.println("Enter the first number ::");
			int a = scn.nextInt();

			System.out.println("Enter the second number ::");
			int b = scn.nextInt();

			int result = ct.add(a,b);
			System.out.println("Result :: "+result);
		}
		catch(NegativeNumberException nne){
			nne.printStackTrace();
		}
	}
}