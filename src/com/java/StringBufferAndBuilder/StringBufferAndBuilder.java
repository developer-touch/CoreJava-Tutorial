package com.java.StringBufferAndBuilder;

public class StringBufferAndBuilder {
	public static void main(String[] args) {
		/**
		 * 1.For storing sequence of characters StringBuffer and StringBuilder
		 *   are alternative classes for String.
		 *   
		 * 2.String is immutable, StringBuffer is mutable
		 */
		
		String s1 = "ankit";
		s1.concat("Raj"); //String is immutable new object is created with the result
		System.out.println(s1);
		System.out.println();
		
		/**
		 * StringBuffer is thread safe mutable object, new object
		 * is not created result is store in current SB object every
		 * time this Buffer Object is locked , thread safe/synchronized.
		 * 
		 * Gives the low performance, slow execution
		 */
		StringBuffer sb1 = new StringBuffer("Ankit ");
		sb1.append("Raj");
		System.out.println(sb1);
		System.out.println();
		
		/**
		 * StringBuider is not thread safe mutable object, new object
		 * is not created result is store in current SB object every
		 * time this Builder Object is not locked , not thread safe/synchronized.
		 * 
		 * Gives the high performance, fast execution
		 */
		
		StringBuilder sb2 = new StringBuilder("Ankit ");
		sb2.append("Chaurasiy");
		System.out.println(sb2);
		
		/**
		 * StringBilder CURD Operation
		 */
		
		//#1:=>INSERT OPERATION
		sb2.append("\nJavaDeveloper");
		sb1.insert(0, false);
	}
}
