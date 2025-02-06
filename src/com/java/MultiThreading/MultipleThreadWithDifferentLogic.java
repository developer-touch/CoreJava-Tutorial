package com.java.MultiThreading;

class MyThread12 extends Thread{
	private int x;
	
	public MyThread12(int x){
		this.x = x;
	}
	
	@Override
	public void run() {
		for(int i = 1; i<=x; i++) {
			System.out.println(getName()+" "+"run i :: "+i);
		}
	}
} 

public class MultipleThreadWithDifferentLogic {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread12 th1 = new MyThread12(20);
		th1.start();
		
		MyThread12 th2 = new MyThread12(10);
		th2.start();
		
		for(int i = 1; i<=30; i++) {
			System.out.println("main i :: "+i);
		}
		System.out.println("main end");
	}
}
