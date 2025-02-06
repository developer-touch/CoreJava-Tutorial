package com.ankit.java11.stringchanges;

public class Java11_Test01_IsBlank {
	public static void main(String[] args) {
		String str1 = "";
		String str2 = " \t \n";
		String str3 = "Hello";
		/**
		 * isBlank method return boolean value if given string is 
		 * blank and just with white space
		 */
		System.out.println("First Str1 Result => "+str1.isBlank()+" "+str1.isEmpty());
		System.out.println("Second Str1 Result => "+str2.isBlank()+" "+str2.isEmpty());
		System.out.println("Third Str1 Result => "+str3.isBlank()+" "+str3.isEmpty());
	}
}
