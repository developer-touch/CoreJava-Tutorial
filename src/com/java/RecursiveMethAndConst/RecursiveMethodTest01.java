package com.java.RecursiveMethAndConst;

public class RecursiveMethodTest01 {
	static void m1() {
		System.out.println("M1");
		m1();
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		m1();
	}	
}
