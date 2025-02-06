package com.ankit.java11.stringchanges;

public class Java11_Test05_StripTrailingLeading {
	public static void main(String[] args) {
		System.out.println("Java11_Test05_StripTrailingLeading.main()");
		String input = "     Ankit Raj       ";
		/**
		 *  This method used to remove all leading white spaces from a string and
		 *  return a new string
		 */
		System.out.println(input);
		System.out.println(input.stripLeading());
		System.out.println(input.stripTrailing());
	}
}
