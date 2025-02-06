/*
 * static method and non-static method
 *	===================================
 *	1. A method that is declared with the keyword static is called static method/class method
 *     A method that is declared without the static keyword is called non-static method/instance method
 *
 *	2. When we need to execute method logic without object or
 *     when we need to execute method logic common to all objects of a class,
 *     then we must declare this method as static method.
 *
 *  3.When we need to execute method logic with object or 
 *    when we need to execute method logic specific one object of class,
 *    then we must declare this method as non-static method.
 */
package com.java.Methods;

public class Method_Types_Test01 {
	
	static void m1() {
		System.out.println("m1 sm executed");
	}
	void m2() {
		System.out.println("m2 nsm executed");
	}
	
	public static void main(String[] args) {
		System.out.println("main executed");
		
		Method_Types_Test01 mt = new Method_Types_Test01();
		mt.m1();
		Method_Types_Test01.m1();
		m1();
		
		mt.m2();
	}
}
