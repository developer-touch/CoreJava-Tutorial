package com.java.MultiThreading;

class AddThread extends Thread{
	@Override
	public void run() {
		//add logic
		int sum = 0;
		for(int i = 1; i<=20; i++) {
			sum += i;
			System.out.println("Addition :: "+sum);
		}
	}
}

class SubThread extends Thread{
	@Override
	public void run() {
		//sub 
		int sub = 0;
		for(int i = 1; i<=20; i++) {
			sub -= i;
			System.out.println("Subtraction :: "+sub);
		}
	}
}
public class MultipleThreadWithDifferentArithmeticCal {
	public static void main(String[] args) {
		System.out.println("main start");
		
		AddThread at = new AddThread();
		at.start();
		
		SubThread st = new SubThread();
		st.start();
	}
}
