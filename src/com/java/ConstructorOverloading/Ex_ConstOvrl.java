/**
 * The constructor execution is decided based on argument type.
 * The passes argument type matched with constructor is executed.
 */
package com.java.ConstructorOverloading;

public class Ex_ConstOvrl {
	Ex_ConstOvrl(){
		System.out.println("NPC");
	}
	
	Ex_ConstOvrl(int a){
		System.out.println("IPC");
	}
	
	Ex_ConstOvrl(String s){
		System.out.println("SPC");
	}
	
	public static void  main(String[] args) {
		Ex_ConstOvrl e1 = new Ex_ConstOvrl();
		Ex_ConstOvrl e2 = new Ex_ConstOvrl(3);
		Ex_ConstOvrl e3 = new Ex_ConstOvrl('a');
		Ex_ConstOvrl e4 = new Ex_ConstOvrl("a");
	}
}
