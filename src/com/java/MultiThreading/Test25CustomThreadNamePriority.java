package com.java.MultiThreading;

class Mythread21 extends Thread{
	@Override
	public void run() {		//this[mt1] //currentThread[main]
		Thread th = Thread.currentThread();
		System.out.println("run is running in "+th.getName()+" thread");
		System.out.println(this.getName());
		System.out.println(Thread.currentThread().getName());
	}
}
public class Test25CustomThreadNamePriority {
	public static void main(String[] args) {
		System.out.println("main start");
		
		Mythread21 th = new Mythread21();
		th.run();	//run is executed in main thread
					//th thread is CRO(Thread -0)
					//th thread is CRTO(main)
		
		th.start();	//run() is executed in custom thread th[Thread-0]
					//CRO	-> th[Thread-0]
					//CRTO 	-> th[Thread-0]
		System.out.println("\nmain end");
	}
}
