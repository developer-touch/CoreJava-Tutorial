package com.java.RecursiveMethAndConst;

public class RecursiveConstructorTest04 {
	RecursiveConstructorTest04 e1 = new RecursiveConstructorTest04();
	
	RecursiveConstructorTest04(){
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		System.out.println("main");
		RecursiveConstructorTest04 e2 = new RecursiveConstructorTest04();
	}
}
