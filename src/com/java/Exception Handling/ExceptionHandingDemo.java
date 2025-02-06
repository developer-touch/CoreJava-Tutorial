/**
	1.What is Exception ?
	  ->In java , exception is an object. it is an instance of one subclass of java.lang.Throwable class.

	  ->It is a runtime error that is occured during runtime and its change the behaviour of program and
	    terminate our program abnormally.

	2.What happend when exception is occured in our program ?
	  ->When a exception is occured in our program then our program is terminate in middle of execution
	  and after exception statmenent not executed.

	3.How to Read Data from CMD ?
	  ->We can read the data from cmd by taking args parameter.
*/
package com.java.ExceptionHandling;

class ReadDataFromCmd{
	public static void main(String[] args){

		int a =Integer.parseInt(args[0]);
		int b =Integer.parseInt(args[1]);

		int c = a/b;
		System.out.println("Resutl :: "+c);
	}
}