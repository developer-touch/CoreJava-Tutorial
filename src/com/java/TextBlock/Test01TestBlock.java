package com.java.TextBlock;

public class Test01TestBlock {
	public static void main(String[] args) {
		/**
		 * :=> Up to java 12V we have one ways to create String literal by using " ".
		 * 
		 * :=> From java 13V onwards we have two ways to create String Literal 
		 * 		1.By using "...."
		 * 		2.By using """......""" (text block)
		 */
		
		/**
		 * with " " we can create only one line text only
		 */
		String s1 = "Java Programming Language";
		System.out.println(s1);
		System.out.println();
		
		/**problem Of "  " ->
		 * -----------------
		 * If we want to store multiple lines of text we must 
		 * use " " + and escape character combination
		 */
		
		String s2 = "Java Prograomming Language "
					+ "By Hari Krishna "
					+"NIT";
		System.out.println(s2);
		System.out.println();
		
		String s3 = "Java Prograomming Language\n"
				+ "By Hari Krishna\n"
				+"NIT";
		System.out.println(s3);
		System.out.println();
		
		String s4 = "SELECT * "+
					"FROM emp "+
					"WHERE eno = 101 "+
					"AND dept='FSJD'";
		System.out.println(s4); 
		System.out.println();
		
		String s5 = "<HTML>\n" +
		
						"\t<HEAD>\n"+
						
								"\t\t<TITLE>\n"+
								
								"\t\t</TITLE>\n"+
							
						"\t</HEAD>\n"+
						
						"\t<BODY>\n" +
						
								"\t\t<H1>\n"+
						
								"\t\t</H1>\n"+
						
						"\t</BODY>\n"+ 
						
					"</HTML>";
		
		System.out.println(s5);
		System.out.println();
		
		/**	
		 * As solution to " " we got text block """----""" for placing
		 * multiple lines of text directly with any extra characters.
		 */
		String s6 = """
					Java Prograomming Language
					By Hari Krishna 
					NIT""";
		System.out.println(s6);
		System.out.println();
		
		String s7 = """
					SELECT * 
					FROM emp 
					WHERE eno = 101 
					AND dept='FSJD'""";
		System.out.println(s7);
		System.out.println();
		
		String s8 = """
					<HTML>
						<HEAD>
							<TITLE>	
								HTML CODE
							</TITLE>
							
						</HEAD>
						
						<BODY>
							<H1>
								Welcome To NIT
								Always Think Like Compiler And JVM And
								Guess What Is Next
							</H1>
						</BODY>
					</HTML>""";
		
		System.out.println(s8);
		System.out.println();

		/**
		 * Rule Of Text Block->
		 * --------------------
		 */
		
		String s9 = """
						'Ankit'
						"Ankit"
					""";
		System.out.println(s9);
		System.out.println();
		
		/*
		 * String s10 = """Ankit	 //CE :
		 * 
		 * """;
		 */		
	}
}
