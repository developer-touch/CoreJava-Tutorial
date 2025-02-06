/***
 * 5.How many ways we can create multiple Thread in Java Stack Area ?
 * =>We can create multiple Thread in 2 ways 
 *   1.By creating multiple thread subclass object and call start() method in Java Stack Area.
 *   2.By creating multiple subclass extends from Thread class then call start() method.
 *   
 *   1 Approach :=> In first approach same logic is executed multiple time.
 *   2 Approach :=> In second approach different logic execute because thread class 
 *                  object is created different Thread class.
 */
package com.java.MultiThreading;

class MyThread07 extends Thread{
	//logic
}

class Thread08 extends Thread{
	//logic
}
public class MutlipleThreadCreation {
	public static void main(String[] args) {
		
		MyThread07 th1 = new MyThread07();
		th1.start();
		
		MyThread07 th2 = new MyThread07();
		th2.start();	//here same logic executed
		
		MyThread07 th3 = new MyThread07();
		th3.start();	//here different logic executed
	}
}
