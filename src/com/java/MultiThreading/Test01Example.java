package com.java.MultiThreading;

import java.util.Scanner;

public class Test01Example {
	static void m1() {
		System.out.println("m1 static");
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter Data ::");
			scn.nextLine();
		}
		System.out.println("\nm1 end");
	}
	
	static void m2() {
		System.out.println("m2 start");
		System.out.println("m2 end");
	}
	
	static void m3() {
		System.out.println("m3 start");
		System.out.println("m3 end");
	}
}
