/**
	1.try must follow Zeor or n number of catch block or 1 finally else it leads to 
	  CE : try without catch or finally

	2.catch must be placed immediately after try block else it leads to
	  CE : catch without try

	3.finally must be placed either immediately after try/catch else leads to 
	  CE : finally without try

	4.catch block parameter must be of type of java.lang.Throwable or its sub
	  classes else leads to 
	  CE : incompatible types

	5.try/catch/finally blocks are not allow at class level directly,because logic
	  is not allowed at class level.

*/
package com.java.ExceptionHandling;

class RuleOfTryCatch{
	public static void main(String[] args){
		try{
			System.out.println("In try");
		}
		catch(Exception e){
			System.out.println("In catch");
		}
		finally{
			System.out.println("In finally");
		}
		m1();
		m2();
		m3();
		m4();
		m5();
	}

	static void m1(){
		try{System.out.println("In m1 Try");}
		finally{System.out.println("In m1 finally");}
	}

	static void m2(){
		try{System.out.println("In m2 Try");}
		finally{System.out.println("In m2 finally");}
		//catch(Exception e ){System.out.println("In M2 catch");} catch without try
	}

	static void m3(){
		//try{System.out.println("In m1 Try");} try without catch and finally
	}

	static void m4(){
		try{System.out.println("In m1 Try");}
//		int a =10; try without catch
		catch(Exception e){System.out.println("m4 catch");}
//		int b = 20; finally without try
		finally{System.out.println("In m1 finally");}
	}

	static void m5(){
		try{System.out.println("In m1 Try");}
		catch(String s){System.out.println("m5 catch");}
		finally{System.out.println("In m1 finally");}
	}
}