package com.java.ExceptionHandling;

class TryCatchExecutionFlowTest01{
	static void m1(){
		System.out.println("Befor try/catch ");
		System.out.println("1");
		//int x = 10/0;
		try{
			System.out.println("In Try");
			System.out.println("2");
			//int x = 10/0;
		}
		catch(ArithmeticException ae){
			System.out.println("In Catch");
			System.out.println("3");
			ae.printStackTrace();
			System.out.println("4");
		}
		System.out.println("After try/catch");
		System.out.println("5");
	}
	public static void main(String[] args){
		m1();
	}
}