/*
 * => A method is a sequence of statement that is placed as a group with proper name and return type.
 * 
 * => It is used to execute our logic with code reusability.
 * 
 * => It is the sub block of our class with specific name and return type. 
 */
package com.java.Methods;

public class Method_Demo {
	static int a;
	static int b;
	
	public static void add() {
		a = 10;
		b = 20;
		
		System.out.println("Result :: "+(a+b));
	}
	public static void main(String[] args) {
		add();
	}
}
