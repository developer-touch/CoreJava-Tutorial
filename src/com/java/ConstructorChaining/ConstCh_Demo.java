/**
 * Calling one constructor from other overloaded constructor either by using this() or by using super() is called constructor chaining
 */
package com.java.ConstructorChaining;

public class ConstCh_Demo {
	
	private int x;
	
	ConstCh_Demo(){
		this(10);
		System.out.println("NPC");
	}
	
	ConstCh_Demo(int x){
		this.x = x;
		System.out.println("IPC");
	}
	
	ConstCh_Demo(String s){
		this(Integer.parseInt(s));
	}
	
	public String toString() {
		return "x :: "+x;
	}
}
