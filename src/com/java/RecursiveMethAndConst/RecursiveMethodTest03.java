package com.java.RecursiveMethAndConst;

public class RecursiveMethodTest03 {
	static {
		System.out.println("SB");
		RecursiveMethodTest03 e1 = new RecursiveMethodTest03();
	}
	RecursiveMethodTest03(){
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		RecursiveMethodTest03 e2 = new RecursiveMethodTest03();
	}
}
