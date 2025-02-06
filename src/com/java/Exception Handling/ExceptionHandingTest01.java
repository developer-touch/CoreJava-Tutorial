/**
	1.try must follow Zeor or n number of catch block or 1 finally else it leads to 
	  CE : try without catch or finally

	2.catch must be placed immediately after try block else it leads to
	  CE : catch without try

	3.finally must be placed either immediately after try/catch else leads to 
	  CE : finally without try
*/
package com.java.ExceptionHandling;

class RuleOfTryCatch{
	public static void main(String[] args){
		try{
			System.out.println("In try");
		}
		catch(Exception e){
			System.out.prrintln("In catch");
		}
		finally{
			System.out.println("In finally");
		}
	}
}