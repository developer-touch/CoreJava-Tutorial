package com.java.NonStaticBlock;

import java.util.Scanner;

public class Test_NSB_02 {
	static Scanner scn = new Scanner(System.in);
	int x;
	{
		System.out.println("Enter x value::");
		x = scn.nextInt();
	}
	Test_NSB_02(){
		System.out.println("NPC\n");
	}
	Test_NSB_02(int x){
		System.out.println("IPC\n");
	}
	public static void main(String[] args) {
		Test_NSB_02 t1 = new Test_NSB_02();
		
		Test_NSB_02 t2 = new Test_NSB_02(4);
	}
}
