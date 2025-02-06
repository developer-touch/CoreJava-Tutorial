package com.ankit.java11.stringchanges;

import java.util.stream.Stream;

public class Java11_Test02_Lines {
	public static void main(String[] args) {
		System.out.println("Java11_Test02_Lines.main()");
		String str = "THis is first line.\nTHis is second line.\nThis is the third line";
		
		/**
		 *  This method splits a string using line terminators and return a new Stream
		 */
		Stream<String> lineStream = str.lines();
		lineStream.forEach(System.out::println);
	}
}
