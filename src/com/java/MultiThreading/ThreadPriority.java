package com.java.MultiThreading;

class MyThread20 extends Thread{
	@Override
	public void run() {
		for(int i = 1; i<=20; i++) {
			System.out.println(getName()+" "+"run i : "+i);
		}
	}
}
public class ThreadPriority {
	public static void main(String[] args) {
		MyThread20 th1 = new MyThread20();	//Thread -0   5
		MyThread20 th2 = new MyThread20();  //Thread -1	  5
		
		System.out.println("th1 priority is : "+th1.getPriority());
		System.out.println("th2 priority is : "+th2.getPriority());
		
		th1.setPriority(10);
		th2.setPriority(7);

		System.out.println("th1 priority is : "+th1.getPriority());
		System.out.println("th2 priority is : "+th2.getPriority());
		
		//th1.setPriority(-3);
		//th2.setPriority(-7);
		
		th1.start();
		th2.start();
	}
	
}
