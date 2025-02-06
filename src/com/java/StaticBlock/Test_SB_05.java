package com.java.StaticBlock;

public class Test_SB_05 {
	static int a;
	static {
		System.out.println("SB");
		a = 10;
	}
	public static void main(String[] args) {
		System.out.println("main");
		System.out.println("a : +a");
	}
}
