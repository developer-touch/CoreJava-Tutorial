package com.java.StaticBlock;

import java.util.Scanner;

public class Test_SB_09 {
	static int a ;
	
	static {
		System.out.println("SB");
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a::");
		a = scn.nextInt();
		
		System.out.println("a value stored");
	}
	public static void main(String[] args) {
		System.out.println("main");
		System.out.println("a : "+a);
	}
}
