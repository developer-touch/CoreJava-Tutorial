package com.java.VariableHidding;

public class Test_Acc_PC_CC {
	void m3() {
		//System.out.println(a);
		//System.out.println(x);
		
		System.out.println(Acc_PCV_IN_CCmain.a);
		System.out.println(Acc_PCV_IN_CC.a);
		
		Acc_PCV_IN_CCmain apc = new Acc_PCV_IN_CCmain();
		Acc_PCV_IN_CC apc1 = apc;
		
		//System.out.println(this.x);
		//System.out.println(super.x);
		
		System.out.println(apc.x);
		System.out.println(apc1.x);
	}
	
	public static void main(String[] args) {
		Test_Acc_PC_CC t = new Test_Acc_PC_CC();
		t.m3();
	}
}
