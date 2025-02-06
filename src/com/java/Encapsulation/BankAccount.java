package com.java.Encapsulation;

public class BankAccount {
	private double balance;
	
	public void setBalance(double balance) throws IllegalArgumentException{
		if(balance<0) 
			throw new IllegalArgumentException("don't pass -ve balabce");
		
		if(balance == 0)
			throw new IllegalArgumentException("don't pass balnce 0");
		
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	
	@Override
	public String toString() {
		return "Balance :: "+this.balance;
	}
}
