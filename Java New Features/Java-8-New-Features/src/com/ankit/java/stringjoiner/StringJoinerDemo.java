package com.ankit.java.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {
	public static void main(String[] args) {
		StringJoiner stringJoiner = new StringJoiner("-");
		stringJoiner.add("Ankit");
		stringJoiner.add("Raj");
		stringJoiner.add("Chaurasiya");
		System.out.println(stringJoiner);
	}
}
