package com.java.StringMethod;

public class Method06Comparing{
	public static void main(String[] args) {
		String s1 = "Ankit";
		String s2 = "ankit";
		System.err.println(s2.equals(s1));	//false
		System.out.println();
		
		s1 = "Ankit";
		s2 = "Ankit";
		System.out.println(s2.equals(s2));
		System.out.println();
		
		s1 = new String("Ankit");
		s2 = new String("ankit");
		System.err.println(s2.equals(s1));	//false
		System.out.println();	
		
		String s3 = new String("Hyd");
		String s4 = new String("hyd");
		System.out.println(s4.equals(s3));	//false
		System.out.println();
		
		s3 = new String("Patna");
		s4 = new String("patna");
		System.out.println(s4.equalsIgnoreCase(s3));	//true 
		System.out.println();
		
		StringBuffer s5 = new StringBuffer("Patna");
		System.out.println(s5.equals(s3));	//false
		
		StringBuffer s6 = new StringBuffer("Patna");
		System.out.println(s6.equals(s5));	//false
		System.out.println();

		StringBuilder s7 = new StringBuilder("Ankit");
		StringBuilder s8 = new StringBuilder("Ankit");
		System.out.println(s7.equals(s1));	//false
		System.out.println(s7.equals(s6));	//false
		System.out.println(s8.equals(s7));	//false
		System.out.println();
		
		s1 = "abc";
		s2 = "bbc";
		System.out.println(s2.compareTo(s1));	//1
		
		s1 = "Abc";
		System.out.println(s2.compareTo(s1));	//33
		
		s1 = "abc";
		s2 = "abcd";
		s3 = "abc";
		System.out.println(s3.compareTo(s1));	//0
		System.out.println(s3.compareTo(s2));	//-1
		
		s1 = "Abc";
		s2 = "aBcd";
		s3 = "abC";
		System.out.println(s3.compareToIgnoreCase(s1));	//0
		System.out.println(s3.compareToIgnoreCase(s2));	//-1
	}
}
 