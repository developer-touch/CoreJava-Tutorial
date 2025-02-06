package com.java.StaticBlock;

public class Test_SB_07 {
	static int a;
	static {
		System.out.println("SB");
		int a = 10;
		a = 20;
	}
	public static void main(String[] args) {
		System.out.println("main");
		System.out.println("a : "+a);
	}
}
