package com.java.RecursiveMethAndConst;

public class RecursiveConstructorTest02 {
	static int count;
	public static void main(String[] args) {
		System.out.println("main start");
		RecursiveConstructorTest02 rc = new RecursiveConstructorTest02();
		System.out.println("Object Created");
		System.out.println("main end");
	}
	int x = m2();
	int m2() {
		System.out.println("NSV x");
		System.out.println("m2 end");
		return 10;
	}
	{
		System.out.println("NSB start");
		System.out.println("end of NSB");
	}
	RecursiveConstructorTest02(){
		System.out.println("constructor start"+ count++);
		RecursiveConstructorTest02 rc2 = new RecursiveConstructorTest02();
		System.out.println("end of constructor");
	}
}

