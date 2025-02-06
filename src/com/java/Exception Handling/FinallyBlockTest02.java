package com.java.ExceptionHandling;

//with exception and catch is not matched
class FinallyBlockTest02{
	public static void main(String[] args){
		System.out.println("Before try/catch/finally");
		try{
			System.out.println("In try");
			int x = 10/0;
		}
		catch(NumberFormatException nfe){
			System.out.println("In catch ");
			nfe.printStackTrace();
		}
		finally{
			System.out.println("In finally");
		}
		System.out.println("After try/catch/finally");
	}
}