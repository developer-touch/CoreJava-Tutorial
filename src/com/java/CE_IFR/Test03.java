package com.java.CE_IFR;

public class Test03 {
	static int a = 10;
	{
		System.out.println("From SB");
		System.out.println("a : "+a);
		System.out.println("b : "+Test03.b);
		
		
	}
	
	
	static void m1() {
		System.out.println("\nFrom SM");
		System.out.println("b : "+b);
	}
	public static void main(String[] args) {
		System.out.println("\nFrom main");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		m1();
	}
	static int b = 20;
}
