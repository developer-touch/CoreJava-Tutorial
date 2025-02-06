package com.java.MultiThreading;

public class Test29CustomThreadGroupName {
	public static void main(String[] args) {
	
		Thread th1 = new Thread();
		ThreadGroup thg = th1.getThreadGroup();
		System.out.println(th1.getName());
		
		Thread th2 = Thread.currentThread();
		System.out.println(th2.getThreadGroup().getName());
		System.out.println();
		
		ThreadGroup thg1 = new ThreadGroup("Group-1");
		Thread th3 = new Thread(thg1, "Child-1");
		Thread th4 = new Thread(thg1, "Child-2");
		System.out.println(th3.getThreadGroup().getName());
		System.out.println(th4.getThreadGroup().getName());
		System.out.println();
		
		ThreadGroup thg2 = new ThreadGroup("Group-2");
		Thread th5 = new Thread(thg2, "Child-3");
		Thread th6 = new Thread(thg2, "Child-4");
		System.out.println(th5.getThreadGroup().getName());
		System.out.println(th6.getThreadGroup().getName());
		System.out.println();

		Thread th7 = new Thread(thg1,"Child-5");
		System.out.println(th7.getName());
		System.out.println(th7.currentThread().getName());
		System.out.println(th7.getThreadGroup().getName());
		System.out.println();

		Thread th8 = new Thread();
		System.out.println(th8.getName());
		System.out.println(th8.currentThread().getName());
		System.out.println(th8.getThreadGroup().getName());
		System.out.println();

		
		Thread th9 = Thread.currentThread();
		System.out.println(th9.getName());
		System.out.println(th9.currentThread().getName());
		System.out.println(th9.getThreadGroup().getName());
	}
}
