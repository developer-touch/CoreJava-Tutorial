package com.java.MultiThreading;

class M1Thread extends Thread{
	@Override
	public void run() {
		Test01Example.m1();
	}
}

class M2Thread extends Thread{
	@Override
	public void run() {
		Test01Example.m2();
	}
}

class M3Thread extends Thread{
	@Override
	public void run() {
		Test01Example.m3();
	}
}
public class ExampleConcurrentExecution {
	public static void main(String[] args) {
		System.out.println("main start");
		
		M1Thread th1 = new M1Thread();
		th1.start();
		
		M2Thread th2 = new M2Thread();
		th2.start();
		
		M3Thread th3 = new M3Thread();
		th3.start();
		
		System.out.println("main end");
	}
}
