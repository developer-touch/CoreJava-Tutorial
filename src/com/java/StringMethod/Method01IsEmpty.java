package com.java.StringMethod;

public record Method01IsEmpty() {
	public static void main(String[] args) {
		String s1 = "Ankit";
		String s2 = " ";
		String s3 = "";
		
		System.out.println(s1.isEmpty());	//false
		System.out.println(s2.isEmpty());	//false
		System.out.println(s3.isEmpty());	//true
	}
}
