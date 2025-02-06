package com.java.ConstructorChaining;

public class ConstCh_Demo_Main {
	public static void main(String[] args) {
		
		ConstCh_Demo e1 = new ConstCh_Demo();
		System.out.println(e1);
		System.out.println();
		
		ConstCh_Demo e2 = new ConstCh_Demo(50);
		System.out.println(e2);
		System.out.println();
		
		ConstCh_Demo e3 = new ConstCh_Demo("45");
		System.out.println(e3);
		
	}
}
