package com.java.RecursiveMethAndConst;

public class RecursiveMethodTest05 {
	static {
		System.out.println("SB start");
		RecursiveMethodTest05 e = new RecursiveMethodTest05();
	}
	
	{
		System.out.println("NSB start");
		System.out.println("NSB end");
	}
	
	RecursiveMethodTest05(){
		System.out.println("constructor");
		System.out.println("constructo end");
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println("main end");
	}
}
