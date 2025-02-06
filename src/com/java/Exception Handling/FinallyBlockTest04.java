package com.java.ExceptionHandling;

//try/finally woth exception
class FinallyBlockTest04{
	public static void main(String[] args){
		System.out.println("Before try/catch/finally");
		try{
			System.out.println("In try");
			System.out.println(10/0);
		}
		finally{
			System.out.println("In finally");
		}
		System.out.println("After try/catch/finally");
	}
}