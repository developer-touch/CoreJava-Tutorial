package com.java.MultiThreading;

class Wish{
	static void wish() {
		Thread th = Thread.currentThread();
		
		String name = th.getName();
		System.out.println(name+" ");
		
		switch(name) {
		case "main":
			System.out.println("hi");
			break;
			
		case "Thread-0":
			System.out.println("Hello");
			break;
			
		case "Thread-1":
			System.out.println("HRU?");
			break;
			
		default :
			System.out.println("WRU?");
		}
	}
}
public class Test28SayWishBasedOnThread {
	public static void main(String[] args) {
		System.out.println("main start");
		Wish.wish();
		
		MyThread23 th = new MyThread23();
		th.run();
		th.start();
		
		MyRunnable23 mr = new MyRunnable23();
		mr.run();
		
		new Thread(mr).start();
	}
}

class MyThread23 extends Thread{
	@Override
	public void run() {
		Wish.wish();
	}
}

class MyRunnable23 implements Runnable{
	@Override
	public void run() {
		Wish.wish();
	}
}