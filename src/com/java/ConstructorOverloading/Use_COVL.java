/**
 * We must overload constructor 
 * 		1.For initializing object by taking initialization value as different type.
 * 		2.For Developing different initialization logic.
 */
package com.java.ConstructorOverloading;

public class Use_COVL {
	private int x ;
	
	Use_COVL(){
		x = 10;
	}
	
	Use_COVL(int x){
		this.x = x;
	}
	
	Use_COVL(String x){
		this.x = Integer.parseInt(x);
	}
	
	public String toString() {
		return "x :: "+x;
	}
}
