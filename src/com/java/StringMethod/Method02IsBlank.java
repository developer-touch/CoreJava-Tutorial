package com.java.StringMethod;

public class Method02IsBlank {
	public static void main(String[] args) {
		String s1 = "Ankit";
		String s2 = " ";
		String s3 = "";
		
		System.out.println(s1.isBlank());	//false
		System.out.println(s2.isBlank());	//true
		System.out.println(s3.isBlank());	//true
	}
}
