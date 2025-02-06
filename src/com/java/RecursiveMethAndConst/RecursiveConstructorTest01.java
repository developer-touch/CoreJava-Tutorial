package com.java.RecursiveMethAndConst;

public class RecursiveConstructorTest01 {
	
	RecursiveConstructorTest01(){
		System.out.println("Constructor");
		RecursiveConstructorTest01 rc = new RecursiveConstructorTest01();
	}
	
	public static void main(String[] args) {
		System.out.println("main");
		RecursiveConstructorTest01 rc = new RecursiveConstructorTest01();
	}
}
