/**
	When we must not use try-with-resources feature:
	================================================
	=>After try block, if we want to use the same resource object 
		1) either inside catch or 
		2) inside method after try,catch block 
		we must not use try-with-resources concept.

		Because we can not access object referenced variable 
		outside try and also this resource connection is closed 
		by end of try block, then if we use this closed connection object, 
		we will get exception with error message collection closed 

	=>The best example is Transcation Management in JDBC
	
	try(Connection con = DriverManger.getConnection(-, -, -) ) {
		---------
		---------
		---------
		con.cmmit();
	}catch(Exception ){
		con.rollback();  //CE: c f s var con
	}
*/

package com.java.java7newfeatures;
import java.io.PrintStream;
import java.util.Scanner;
class TryWithResourceTest03{
	public static void main(String[] args){

		try(PrintStream ps = new PrintStream(System.out);
			Scanner scn = new Scanner(System.in)){
				System.out.println("Enter your name :: ");
				String name = scn.nextLine();

				System.out.println("Hi,"+name);
		}
	}
}
