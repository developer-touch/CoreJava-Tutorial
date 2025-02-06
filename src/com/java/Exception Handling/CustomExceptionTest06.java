package com.java.ExceptionHandling;
import java.util.Scanner;
class Voter{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		Voting v = new Voting();
		
			System.out.println("Enter your age :: ");
			int age = scn.nextInt();

			v.vote(age);

	}
}