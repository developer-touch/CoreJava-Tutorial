package com.java.StringHandlingProject;

/***
 * 1.What is a literal ?
 * ->A literal is constant value that we can type in the program.
 * 
 * 2.Types of Literals 
 * ->Java supports 7 types of literal
 * 		
 * 		=>Primitive type literals[just value,memory is not allocated]
 * 		1.Integer literals
 * 			a.int literal	->10
 * 			b.long literal	->10L
 *	
 *		2.Floating-point literals
 *			a.float literal	->10.5f
 *			b.double literal ->10.5
 *		
 *		3.char literal
 *		
 *		4.boolean literal
 *		
 *		=>Reference type literals[object,instance of a class,memory is allocated]
 *		
 *		5.null literal 	-> null  [it just a value]
 *
 *		6.String literal -> "string" [it is an object,instance of java.lang.Class class]
 *
 *		7.Class literal -> A.class 	[it is an object,instance of java.lang.Class class]
 *
 *======================================================================================================================================
 *
 *	1.What is string,String literal, String ?
 *		:=>A sequence of character placed in " " is called string or String literal.
 *	
 *	 	:=>A string literal can we store string data in the program is an instance of java.lang.String class.
 *
 *	2.How can we store string data in the program, like name, course,bikeNumber,etc...?
 *		 :=>we must create String class type reference variable.
 *
 *	3.How can we store alph-numeric data, like PAN,BIKE number ... ?
 *   	:=>We must use String class object.
 *   
 * 	4.What is displayed when we print String object ?
 *   	:=>Its data is printed , nut not classname@hc
 *   
 *  5.Why String class object data is printed,Why not for our own class ?
 *   	:=>When we print data any class object,inside println() method the predefined method toString() is called.
 *   	   The println() method prints the toString() method returned value.
 *   
 *   	:=>From java.lang.Object class it returns CN@hc 
 *   	
 *   	:=>If we want to return object data we  must Override toString() in our class.
 *   
 *   	:=>In string class toString() method is Overridden to print sting object data.
 *   
 *   	:=>Whereas in our own class we have not Overridden toString() so, it is executed from java.lang.Object class
 *         and return CN@HC
 *         
 *      :=>If we want to  print our class object data, we must also overridden toString() method in our class.
 *
 * 		
 */

class Example{
	private int x;
	
	public Example(int x) {
		this.x=x;
	}
}

class Sample{
	private int x;
	
	public Sample(int x) {
		this.x=x;
	}
	
	@Override
		public String toString() {
			return "x :: "+x;
		}
}
public class Test01_StringlDemo {
	public static void main(String[] args) {
		//System.out.println(ankit);	//variable
		System.out.println("Ankit");
		
		String s1 = "ANkit";
		String s2 = "ABCD1234F";
		String s3 = "BR1H1234";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		Example e = new Example(10);
		System.out.println(e);		//e.toString() ->Object ->Example@HC
		
		Sample s = new Sample(10);
		System.out.println(s);		//s.toString() ->Sample -> 10
	}
}