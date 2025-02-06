package com.java.StaticBlock;

public class Test_SB_08 {
	static int a;
	static {
		System.out.println("SB");
		int a = 10;
		a = 20;
		Test_SB_08.a = 30;
	}
	public static void main(String[] args) {
		System.out.println("main");
		System.out.println("a : "+a);
	}
}
