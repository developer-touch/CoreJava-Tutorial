package com.java.StringHandlingProject;

/***
 * 11.What is the meaning of immutable and mutable object ?
 * 		:=>An object whose data can we not change at runtime is called immutable object.
 * 			For Example :-> String and all wraperClasss object are immutable.
 * 		
 * 		:=>An object whose data we can modify in the same memory is called mutable object.
 *			For Example :-> array,collection and all user defined classes object
 *
 * 12.String object is immutable,what is the meaning of it ?
 * 		:=>After creating string object with some data we can 
 * 		   not modify its data in this same object.
 * 		
 * 		:=>If we try to modify, the result is stored in new 
 * 		   object and returns.
 * 
 * 		:=>The original referenced variable still points to the 
 * 		   same old and original object.
 * 
 * 		:=>If we want to have both original data object and modify 
 *         content object, we must assign the result object to a 
 *         new variable.
 *         
 * 13.String object is immutable, is String reference variable also immutable ?
 * 		:=>No,we can assign new String object.
 * 		:=>Then it refers to new String object.
 * 
 * 14.How can we make String reference variable also immutable ?
 * 		:=>Declare it as final
 * 
 */
public class Test03StringImmutable {
	public static void main(String[] args) {
		String s1 = "Ankit";
		s1.concat("Chaursiya");
		System.out.println(s1);  //Ankit
		
		String s2 = s1.concat("Chaurasiya");
		System.out.println(s1);	//Ankit
		System.out.println(s2);	//Ankit Chaurasiya
		
		String s3 = "Hajipur";
		s3 = "Patna";
		System.out.println(s3);  //Patna
		
		final String s4 = "Monu";
		//s4 = "Kumar";
	}
}
