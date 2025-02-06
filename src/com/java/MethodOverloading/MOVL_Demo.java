/**
 * 1.What is Method Overloading ?
 * ------------------------------
 * =>Defining multiple methods with same name but with different parameters 'type or list or order'.
 * 
 * 2.Sample Program ?
 * ------------------
 * =>For adding two different type number or different list of number or different type order number.
 * 
 * =>We must define all method with the same name add.
 * 
 * Below program show MOVL Concept.
 */
package com.java.MethodOverloading;

public class MOVL_Demo {

	void add(int a,int b){
		System.out.println("add(int,int) method executed");
	}
	
	void add(float f,float f1) {
		System.out.println("add(float,float) method executed");
	}
	
	void add(int i,int i1,int i2) {
		System.out.println("add(int,int,int) method executed");
	}
	
	void add(float f,float f1,float f2) {
		System.out.println("add(float,float,float) method executed");
	}
	
	void add(float f,int i) {
		System.out.println("add(float,int) method executed");
	}
	
	void add(int i,float f) {
		System.out.println("add(int,float) method executed");
	}
	
	/**
	 * When we call a OLM the given argument matched parameter method is executed
	 * .The matched parameter means the given argument's same type or its higher range
	 * type parameter method.
	 * 
	 * =>Lesser To Higher Range Parameter Types(Widening Type)
	 * =======================================================
	 * 
	 *  	byte -> short
	 *          		\
	 *          		->int ->long ->float -> double
	 *          		/
	 *          	char
	 */
}
