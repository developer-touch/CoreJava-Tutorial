package com.java.ExceptionHandling;

//finally block with return kw
class FinallyBlockWithReturnTest01{

	static int finallywithReturn(){
		System.out.println("Before try/catch/finally");
		try{
			System.out.println("In try");
			return 10;
		}
		catch(ArithmeticException ae){
			System.out.println("In catch");
			return 20;
		}
		finally{
			System.out.println("In finally");
			return 30;
		}
		//System.out.println("After try/catch/finally");
	}
	public static void main(String[] args){
		finallywithReturn();
	}
}