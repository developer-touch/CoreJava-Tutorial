package com.java.ExceptionHandling;

class CustomTest{
	public int add(int a,int b) throws NegativeNumberException{
		if(a<0 || b<0)
			throw new NegativeNumberException("Dno't pass -ve number");
		int c = a+b;
		return c;
	}

}