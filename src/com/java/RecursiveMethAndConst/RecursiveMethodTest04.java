package com.java.RecursiveMethAndConst;

public class RecursiveMethodTest04 {
	static RecursiveMethodTest04 e1 = new RecursiveMethodTest04();

	RecursiveMethodTest04(){
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		System.out.println("main");
		RecursiveMethodTest04 e2 = new RecursiveMethodTest04();
	}
}
