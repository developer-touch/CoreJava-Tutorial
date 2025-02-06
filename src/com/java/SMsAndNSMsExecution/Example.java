package com.java.SMsAndNSMsExecution;

public class Example {
	static Example e1 = new Example();
	
	static {
		System.out.println("SB Start\n");
		Example e2 = new Example();
		System.out.println("SB End\n");
	}
	
	Example (){
		System.out.println("NPC start");
		Example e3 = new Example(5);
		System.out.println("NPC End\n");
	}
	
	Example(int x){
		System.out.println("IPC Exexuted\n");
	}
	
	static int a = m1();
	
	static int m1() {
		System.out.println("SV Initialize\n");
		return 10;
	}
	
	int x = m2();
	
	int m2() {
		System.out.println("NSV X Initialize");
		return 30;
	}
	
	static {
		System.out.println("SB2 is executed");
	}
	
	{
		System.out.println("NSB is executed");
	}
	
	public static void main(String[] args) {
		System.out.println("Main start");
		Example e4 =  new Example();
		m3();
		e4.m4();
		System.out.println("Main Ends\n");
	}
	
	static void m3() {
		System.out.println("m3 start\n");
		Example e5 = new Example();
		System.out.println("m3 end");
	}
	
	void m4() {
		System.out.println("m4 start\n");
		Example e6 = new Example();
		System.out.println("m4 end");
	}
	static void m5() {
		System.out.println("m5 start\n");
		Example e7 = new Example();
		System.out.println("m5 end\n");
	}
	
	static int b = 20;
	
	int y = 30;
	
	static {
		System.out.println("SB3 executed\n");
	}
	
	{
		System.out.println("NSB2 executed\n");
	}
	
	static Example e8 = new Example(5);
}
