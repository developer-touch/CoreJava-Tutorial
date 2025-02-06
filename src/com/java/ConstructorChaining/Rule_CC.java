/**
 * Rule in placing this() and super->
 * ----------------------------------
 * 1.Both must placed as first statement in constructor.
 * 
 * 2.Hence we can't placed both this() and super() in single constructor.
 * 
 * 3.We can't place this() in all constructor mutually.
 */
package com.java.ConstructorChaining;

public class Rule_CC extends Super_Call_CC_01{
	
	Rule_CC(){
		System.out.println("NPC");
		//this();
	}
	Rule_CC(int x){
		System.out.println("NPC");
		//super();
	}
	Rule_CC(String x){
		this();
		//super();
		System.out.println("SPC");
	}
	Rule_CC(double x){
		super();
		//this();
		System.out.println("SPC");
	}
}
