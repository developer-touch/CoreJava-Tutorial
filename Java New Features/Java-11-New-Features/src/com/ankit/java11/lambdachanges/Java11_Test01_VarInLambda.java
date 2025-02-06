package com.ankit.java11.lambdachanges;

@FunctionalInterface
interface I1 {
	public String concat(String s1, String s2);
}

public class Java11_Test01_VarInLambda {
	public static void main(String[] args) {
		System.out.println("Java11_Test01_VarInLambda.main()");
		
		I1 i1 = (firstString, secondString) -> firstString + secondString;
		/**
		 * var kw is used to declare a local variable without determinds the data types
		 * it can hold any data type
		 * 
		 * Note => we can not mixed the different type using var
		 */
		I1 i2 = (var firstString, var secondString) -> firstString + secondString;
		/* I1 i3 = (var firstString,String secondString) -> firstString+secondString; */
		
		System.out.println(i1.concat("Ankit", " Raj"));
		System.out.println(i2.concat("Monu", " Kumar"));
	}
}
