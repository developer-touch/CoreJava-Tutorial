package com.ankit.java.streamapi.matchingoperation;

import java.util.Arrays;
import java.util.List;

public class NonMatchOperationOnStream {
	public static void main(String[] args) {
		System.out.println("NonMatchOperationOnStream.main()::main started");
		List<String> nameList = Arrays.asList("Ankit", "Monu", "sonu", "Ankit", "Raj", "monu");
		boolean nameStatus1 = nameList.stream().noneMatch(name -> name.equals("Ankit"));
		System.out.println("Non Match Name ? " + nameStatus1);
		boolean nameStatus2 = nameList.stream().noneMatch(name -> name.equals("Ankita"));
		System.out.println("Non Match Name ? " + nameStatus2);
		System.out.println("NonMatchOperationOnStream.main()::main ended");
	}
}
