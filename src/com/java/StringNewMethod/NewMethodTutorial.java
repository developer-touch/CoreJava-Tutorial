package com.java.StringNewMethod;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NewMethodTutorial {
	public static void main(String[] args) {
		String s1 = "ABC";
		
		/**
		 * s1.chars();		//9
		 * 
		 * s1.lines();			//11
		 * s1.strip();			//11
		 * s1.repeat(0);		//11 
		 * s1.stripLeading();	//11 
		 * s1.stripTrailing();	//11
		 * 
		 * s1.indent(0);					//12
		 * s1.describeConstable();			//12
		 * s1.resolveConstantDesc(null);	//12
		 * s1.splitWithDelimiters(s1, 0);	//12
		 * 
		 * s1.formatted();		//15
		 * s1.stripIndent();	//15
		 */
		
		/**
		 * Difference Between trim() and strip() method
		 */
		
		String s2 = " abc bbc ccb  ";
		String s3 = s2.trim();
		String s4 = s2.strip();
		System.out.println(s2 +"hi-->"+s2.length());
		System.out.println(s3+"hi-->"+s3.length());
		System.out.println(s4+"hi-->"+s4.length());
		System.out.println();
		
		String s5 = "\0 h1 \0";
		String s6 = s5.trim();		//can remove empty char and space
		String s7 = s5.strip();		//can remove only space
		System.out.println(s5 +"hi-->"+s5.length());	
		System.out.println(s6+"hi-->"+s6.length());
		System.out.println(s7+"hi-->"+s7.length());
		System.out.println();
		
		/**
		 * Difference Between stripLeading() and stripTrailing() method
		 */
		
		String s8 = "  abc bbc  ";
		String s9 = s8.stripLeading();
		String s10 = s8.stripTrailing();
		System.out.println(s8+"hi-->"+s8.length());
		System.out.println(s9+"hi-->"+s9.length());
		System.out.println(s10+"hi-->"+s10.length());
		System.out.println();

		/**
		 * Chars() method
		 * =>return all the char from the String
		 * =>It return Stream object
		 */
		
		s1 = "abc";
		IntStream chars =  s1.chars();
		chars.forEach(ch->System.out.println((char)ch));
		System.out.println();
		
		/**
		 * Lines() Method 
		 * =>It also return all the char from String
		 * =>It also return Stream object
		 */
		
		s1 = "javaprogramming";
		Stream<String> lines = s1.lines(); 
		lines.forEach(line->System.out.println(line));
		System.out.println();
		
		s1 = "java\nprogramming";
		Stream<String> lines1 = s1.lines(); 
		lines1.forEach(line->System.out.println(line));
		System.out.println();
		
		s1 = """
				A
				B
				C
				B
			 """;
		Stream<String> lines2 = s1.lines();
		lines2.forEach(line->System.out.println(line));
		System.out.println();
		
		/**
		 * Repeat() Method 
		 * =>to repeat a string multiple time as given count
		 */
		s1 = "Ankit\t";
		s2 = s1.repeat(3);
		System.out.println(s2);
		System.out.println();
		
		/**
		 * indent() method
		 * =>To format the string to add tab space
		 */
		
		s1 = "ankit";
		s2 = s1.indent(1);
		System.out.println(s2);
		
		s1 = """
				Ankit
				Tanu
				Monu
				Sonu
				
				""";
		
		s2 = s1.indent(1);
		System.out.println(s2);
	}
}
