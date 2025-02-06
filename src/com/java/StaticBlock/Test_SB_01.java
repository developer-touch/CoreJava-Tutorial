/*
 * A class level nameless block that contain static KW in its declaration is called SB.
 * 
 * It is used to initialize static variable and store logic only one time at the time of class l
 */
package com.java.StaticBlock;

public class Test_SB_01 {
	static int x;
	
	static {
		System.out.println("SB Executed.");
		x = 10;
	}
	Test_SB_01(){
		System.out.println("NPC Execcuted");
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
		int x = 20;
		System.out.println("X : "+x);
		System.out.println("X : "+Test_SB_01.x);
		System.out.println("Main End");
	}
}
