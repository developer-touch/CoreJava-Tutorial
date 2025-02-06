package com.java.RecursiveMethAndConst;

public class RecursiveConstructorTest05 {
	int x = m1();
	
	int m1() {
		System.out.println("NSV x");
		System.out.println("end m1");
		return 10;
	}
	
	{
		System.out.println("NsB start");
		RecursiveConstructorTest05 e1 = new RecursiveConstructorTest05();
		System.out.println("NSV end");
	}
	
	RecursiveConstructorTest05(){
		System.out.println("constructor start");
		System.out.println("constructor end");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		RecursiveConstructorTest05 e2 = new RecursiveConstructorTest05();
		System.out.println("main end");
	}
}
