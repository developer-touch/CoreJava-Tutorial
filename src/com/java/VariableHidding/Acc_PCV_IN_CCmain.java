package com.java.VariableHidding;

public class Acc_PCV_IN_CCmain extends Acc_PCV_IN_CC{
	
	static int a = 30;
	int x = 40;
	
	static void m1() {
		System.out.println(a);
		System.out.println(Acc_PCV_IN_CC.a);
		
		Acc_PCV_IN_CCmain apc = new Acc_PCV_IN_CCmain();
		
		Acc_PCV_IN_CC a1 = apc;
		
		System.out.println(apc.a);
		System.out.println(a1.x);
	}
	
	void m2() {
		System.out.println(a + " "+Acc_PCV_IN_CC.a);
		System.out.println(x + " "+super.x);
	}
	
	public static void main(String[] args) {
		m1();
		
		Acc_PCV_IN_CCmain apc1 = new Acc_PCV_IN_CCmain();
		apc1.m2();
	}
}


