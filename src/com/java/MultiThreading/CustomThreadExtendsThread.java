/***
 * =>We can create custom thread in two ways
 *   1.By extends superclass Thread
 *   2.By implements Runnable interface
 *   
 *   1:=>We can create custom Thread by extends super class Thread.
 *       In this approach to execute custom thread we can create object of this class.
 *       
 */
package com.java.MultiThreading;

class MyThread01 extends Thread{
	
	/***
	 * =>run() method is the predefined method that is defined in Overrides: run() in Thread
	 *   this run() method has our own logic to defined user defined or our own task to execute
	 *   we can Override run() in custom thread.
	 */
	@Override
	public void run() {
		System.out.println("Run executed");
	}
}
public class CustomThreadExtendsThread {
	public static void main(String[] args) {
		System.out.println("main start");
		
		//creating custom thread class object 
		MyThread01 mt = new MyThread01();
		
		/***
		 * start() method work is, it requested to JVM to run our logic in free time so JVM store its 
		 * logic in to execute 
		 */
		mt.start();
		
		System.out.println("main end");
	}
}
