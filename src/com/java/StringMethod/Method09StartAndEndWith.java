package com.java.StringMethod;

public class Method09StartAndEndWith {
	public static void main(String[] args) {
		String s1 = "Java java programming";
		System.out.println(s1.startsWith("J"));
		System.out.println(s1.startsWith("Java"));
		System.out.println(s1.startsWith("java"));
		System.out.println();
		
		System.out.println(s1.endsWith("g"));
		System.out.println(s1.endsWith("ng"));
		System.out.println(s1.endsWith("java"));	
	}
}

