/**
	Java 7 new features w.r.t try,catch amd finally
	==============================================
	1.try-with-resource
	2.catch with multiple exception

	try-with-resource :->
	---------------------
	=>try with resource is a java 7 new features.It is given for 
	  automatic resources management.

	=>Using try with resource,we can make the connection based objects,such as
	  io,socket & JDBC object closed automatically at the end of the try block.

	=>It means,using try with resource features we no need to place finally block
	  with the close() method call.

	=>With the new feature try with resource behalf of the programmer compiler s/w
	  will place finally block with the close method call at compilation time in 
	  .class file by handling NPE with if(!=null) condition.

	=>The try-with-resources statement is a try statement that declares 
	  one or more resources. A resource is as an object that must be closed 
      after the program is finished with it. The try-with-resources statement 
      ensures that each resource is closed at the end of the try statement. 

    =>Any object that implements java.lang.AutoCloseable interface 
      either directly or indirectly can be used as a resource.

	#.Syntax Of try with resource :->
	--------------------------------
		try(
		AutoCloseable type 
		object creation statement;
		variable declation = new constructor();
	){
		
		Regular logic as we were writing in earlier programs.

		It is the logic that performs operations 
		by using above resource object
	}

	
	Note: If we create try block with a resource object, 
	after try block, we no need to place catch/finally blocks, 
	because compiler will place finally block internally.

	
*/

//Upto java 6v onwards
package com.java.java7newfeatures;
import java.io.PrintStream;
class TryWithResourceTest02{
	public static void main(String[] args){

		try(PrintStream ps = new PrintStream(System.out)){
			System.out.println("Hi");
		}
	}
}
