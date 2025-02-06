package com.java.VariableHidding;

public class Variable_Hidding_Testo1Main extends Variable_Hidding_Testo1 {
	
	static int a = 30;
	int x = 40;
	
	void m1() {
		System.out.println("a :: "+a);
		System.out.println("x :: "+x);
		
		System.out.println(Variable_Hidding_Testo1Main.a);
		System.out.println(this.a);
	}
	
	public static void main(String[] args) {
		Variable_Hidding_Testo1Main vhm = new Variable_Hidding_Testo1Main();
		vhm.m1();
	}
}
