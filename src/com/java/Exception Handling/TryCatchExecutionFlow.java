package com.java.ExceptionHandling;

class TryCatchExecutionFlow{
	public static void main(String[] args){
		System.out.println("Befor try/catch ");
		try{
			System.out.println("In Try");
			int x = 10/0;
		}
		catch(ArithmeticException ae){
			System.out.println("In Catch");
			ae.printStackTrace();
		}
		System.out.println("After try/catch");
	}
}