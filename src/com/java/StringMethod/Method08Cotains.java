package com.java.StringMethod;

public class Method08Cotains {
	public static void main(String[] args) {
		String s1 = "Java Programming";
		System.out.println(s1.contains("A"));
		System.out.println(s1.contains("a"));
		System.out.println(s1.contains(""));
		System.out.println(s1.contains(" "));
		System.out.println(s1.contains("java"));
		System.out.println(s1.contains("Java"));
		System.out.println();
		
		s1 = "Java java programming";
		System.out.println(s1.contains("A"));
		System.out.println(s1.contains("a"));
		System.out.println(s1.contains(""));
		System.out.println(s1.contains(" "));
		System.out.println(s1.contains("java"));
		System.out.println(s1.contains("Java"));	
	}
}
