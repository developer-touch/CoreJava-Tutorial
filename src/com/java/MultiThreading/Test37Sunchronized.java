package com.java.MultiThreading;

class Addition {
	private int x;
	private int y;
	
	//void add(int x,int y) {
	synchronized void add(int x,int y) {
		System.out.println(Thread.currentThread().getName()+"started");
		this.x=x;
		this.y=y;
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int res = this.x+this.y;
		System.out.println(Thread.currentThread().getName()+" res :: "+res);
		System.out.println(Thread.currentThread().getName()+"end");
	}
}

class MyThread29 extends Thread{
	private Addition a;
	
	public MyThread29(Addition a) {
		this.a=a;
	}
	
	@Override
	public void run() {
		a.add(50, 60);
	}
}
class MyThread30 extends Thread{
	private Addition a;
	
	public MyThread30(Addition a) {
		this.a=a;
	}
	
	@Override
	public void run() {
		a.add(70, 80);
	}
}
public class Test37Sunchronized {
	public static void main(String[] args) {
		Addition a1 = new Addition();
		Addition a2 = new Addition();
		MyThread29 th1 = new MyThread29(a1);
		th1.start();
		
		MyThread30 th2 = new MyThread30(a1);
		th2.start();		//sequential
		MyThread30 th3 = new MyThread30(a2);
		th3.start();		//concurrent
	}
}
