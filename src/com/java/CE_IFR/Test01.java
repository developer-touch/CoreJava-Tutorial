package com.java.CE_IFR;

public class Test01 {
	static int a = 10;
	static {
		System.out.println("From SB");
		System.out.println("a : "+a);
		//System.out.println("b : "+b); I F R
		System.out.println("b : "+Test01.b);
	}
	public static void main(String[] args) {
		System.out.println("From Main");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
	static int b = 20;
}
