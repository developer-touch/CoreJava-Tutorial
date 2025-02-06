package com.java.StringMethod;

public class Method07ComparingContent {
	public static void main(String[] args) {
		String s1 = new String("Ankit");
		String s2 = new String("Ankit");
		System.out.println(s1==s2);	//false
		System.out.println(s1.equals(s2));	//true
		System.out.println(s1.contentEquals(s2));	//true
		System.out.println();
		
		s2 = new String("ankit");
		System.out.println(s1==s2);	//false
		System.out.println(s1.equals(s2));	//false
		System.out.println(s1.contentEquals(s2));	//false
		System.out.println();
		
		StringBuffer s3 = new StringBuffer("Anlit");
		StringBuffer s4 = new StringBuffer("Ankit");
		System.out.println(s3==s4);	//false
		System.out.println(s4.equals(s3));	//false
		System.out.println(s2.contentEquals(s4));	//false
		System.out.println();
		
		StringBuilder s5 = new StringBuilder("Ankit");
		StringBuilder s6 = new StringBuilder("Ankit");
		System.out.println(s5==s6);	//false
		System.out.println(s5.equals(s6));	//false
		System.out.println(s5.equals(s2));	//false
		System.out.println(s6.equals(s4));	//false
	}
}
