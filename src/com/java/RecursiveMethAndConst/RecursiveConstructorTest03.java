package com.java.RecursiveMethAndConst;

public class RecursiveConstructorTest03 {
	
	{
		System.out.println("NSB");
		RecursiveConstructorTest03 rc1 = new RecursiveConstructorTest03();
	}
	RecursiveConstructorTest03(){
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		System.out.println("main");
		RecursiveConstructorTest03 rc2 = new  RecursiveConstructorTest03();
	}
}

