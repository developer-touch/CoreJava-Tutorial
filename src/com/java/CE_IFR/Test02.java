package com.java.CE_IFR;

public class Test02 {
	static int a = 10;
	 static {
		 System.out.println("From SB");
		 System.out.println("a : "+a);
		 System.out.println("b : "+Test02.b);
		 b = 30;
		 //System.out.println(b);
	 }
	 public static void main(String[] args) {
		 System.out.println("From MN");
		 System.out.println(b);
	 }
	 static int b = 20;
}
