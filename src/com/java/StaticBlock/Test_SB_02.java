package com.java.StaticBlock;

public class Test_SB_02 {
	static int a = m1();
	
	static {
		System.out.println("SB Executed");
	}
	private static int m1() {
		System.out.println("SV : a");
		return 10;
	}
	public static void main(String[] args) {
		System.out.println("Main ");
		m1();
		System.out.println("Main End");
	}
}
