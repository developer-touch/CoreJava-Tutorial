/**
 * =>Every time from all constructor by DF super class no-param constructor is executed.If we want to execute parameterized constructor
 *   We must place super(-) with matched argument of super class constructor.
 */
package com.java.ConstructorChaining;

public class Super_Call_CC_01 {
	Super_Call_CC_01(){
		System.out.println("Super_Call_CC_01 NPC");
	}
	Super_Call_CC_01(int x){
		System.out.println("Super_Call_CC_01 IPC");
	}
}
