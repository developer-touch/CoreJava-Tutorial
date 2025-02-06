package com.ankit.java11.stringchanges;

public class Java11_Test04_StripLeading {
	public static void main(String[] args) {
		System.out.println("Java11_Test04_StripLeading.main()");
		String input = "     Ankit";
		/**
		 *  This method used to remove all leading white spaces from a string and
		 *  return a new string
		 */
		System.out.println(input);
		System.out.println(input.stripLeading());
	}
}
