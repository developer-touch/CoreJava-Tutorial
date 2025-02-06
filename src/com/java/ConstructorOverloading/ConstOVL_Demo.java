/**
 * Constructor Overloading :: =>
 * -----------------------------
 * =>In  a class, defining multiple constructors with different parameters 'types or list or order '
 *   is called constructor overloading. 
 */
package com.java.ConstructorOverloading;

public class ConstOVL_Demo {
	
	ConstOVL_Demo(){
		System.out.println("NPC");
	}
	ConstOVL_Demo(int a){
		System.out.println("IPC");
	}
	ConstOVL_Demo(String s){
		System.out.println("SPC");
	}
}
