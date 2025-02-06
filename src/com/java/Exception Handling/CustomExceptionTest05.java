package com.java.ExceptionHandling;
class Voting{
	public void vote(int age) throws LesserAgeException{
		if(age<18)
			throw new LesserAgeException("Age less than 18,not eligible for voting");
		else
			System.out.println("Please vote..");
	}
}