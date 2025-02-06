/*
 * 
 * =>A class level nameless {} block that doen't contain static KW in its declaration is called non-static block.
 * 
 * =>The NSB is also called as instance initializer block.
 * 
 * =>A NSB is used to initialize NSV and execute some logic common to all constructor 
 *   only once at the time of object creation.
 */
package com.java.NonStaticBlock;

public class Test_NSB_01 {
	{
		System.out.println("NSB");
	}
	Test_NSB_01(){
		System.out.println("NPC\n");
	}
	Test_NSB_01(int x){
		System.out.println("IPC\n");
	}
	public static void main(String[] args) {
		System.out.println("Main Start\n");
		
		Test_NSB_01 t1 = new Test_NSB_01();
		Test_NSB_01 t2 = new Test_NSB_01(5);
		
		System.out.println("Main End");
	}
}
