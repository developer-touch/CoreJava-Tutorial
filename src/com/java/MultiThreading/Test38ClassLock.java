package com.java.MultiThreading;

class Addition2 {
	private static int x;
	private static int y;
	
	static synchronized void add(int x,int y) {
		Addition2.x=x;
		Addition2.y=y;
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int res = Addition2.x+Addition2.y;
		System.out.println(Thread.currentThread().getName()+"Result : "+res);
	}	
}

class MyThread31 extends Thread{
	@Override
	public void run() {
		Addition2.add(20, 30);
	}
}
class MyThread32 extends Thread{
	@Override
	public void run() {
		Addition2.add(50, 50);
	}
}
public class Test38ClassLock {
	public static void main(String[] args) {
		MyThread31 th1 = new MyThread31();
		MyThread32 th2 = new MyThread32();
		
		th1.start();
		th2.start();
	}
}
