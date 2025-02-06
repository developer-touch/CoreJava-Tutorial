package com.java.StringMethod;

public class Method03Length {
	public static void main(String[] args) {
		String s1 = "Ankit";
		System.out.println(s1.length());
		
		s1 = "";
		System.out.println(s1.length());
		
		s1 =" ";
		System.out.println(s1.length());
		
		s1 = " Ankit" + "Monu";
		System.out.println(s1.length());
		
		int[] s2 = {10,20,30,40};
		byte[] s3 = {10,20,30,40,50};
		
		System.out.println(s2.length);
		System.err.println(s3.length);
	}
}
