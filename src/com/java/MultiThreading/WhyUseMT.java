/***
 *=> We can use  MiltiThreading to execute more than one task concurrently.
 * 
 *=> Without MultiTHreading class our program execution is sequentially so it 
 *   take more time to execute multiple task.
 *   
 *=>What is difference between sequential execution and Concurrent execution ?
 *
 *	Sequential Execution :=> Sequential execution means single thread execution-takes more time 
 *  						   to complete all method execution.
 *  
 *  Concurrent Execution :=> Concurrent execution means multi-threading execution takes less time
 *   						   to complete all method execution.
 *   
 *  1.Up to now we have learned executing multiple task sequentially by calling those all tasks method
 *    method in the main method one after one.
 *    
 *  2.The problem in sequential flow of executing is-
 *  
 *    1.Executing takes more time
 *    2.If one task executing is paused, other tasks can't be executed.
 *    3.Due to this CPU ideal time will be more, time will be wasted.
 *    4.Project execution is slow
 *    5.We will get performance issue
 *    
 * 	3.Solution is we must use multi-threading
 *   
 *  Below program show the single thread execution flow.
 * 
 */
package com.java.MultiThreading;

public class WhyUseMT {
	static void m1() {
		System.out.println("m1 executed");
	}
	static void m2() {
		System.out.println("m2 executed");
	}
	static void m3() {
		System.out.println("m3 executed");
	}
	
	public static void main(String[] args) {
		m1();
		m2();
		m3();
	}
}
