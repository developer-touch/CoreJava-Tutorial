package com.java.NonStaticBlock;

public class Test_NSB_03 {
	{
		System.out.println("NSB1");
		
		{
			System.out.println("local block");
		}
		
	}
	Test_NSB_03(){
		System.out.println("NPC");
	}
	{
		System.out.println("NSB2");
	}
	public static void main(String[] args) {
		Test_NSB_03 t1 = new Test_NSB_03();
	}
}
