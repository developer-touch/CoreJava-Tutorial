package com.java.MultiThreading;

class MyRannable6 implements Runnable{
	@Override
	public void run() {
		//System.out.println(this.getName());
		Thread th = Thread.currentThread();
		System.out.println(th.getName());
	}
}
public class Test26CustomThreadRunnableNamePriority {
	public static void main(String[] args) {
		MyRannable6 mr = new MyRannable6();
		mr.run();
		
		Thread th = new Thread(mr);
		th.start();
		
	}
}
