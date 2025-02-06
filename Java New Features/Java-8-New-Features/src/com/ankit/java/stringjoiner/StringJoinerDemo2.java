package com.ankit.java.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
	public static void main(String[] args) {
		StringJoiner stringJoiner = new StringJoiner("-","(",")");
		stringJoiner.add("Ankit");
		stringJoiner.add("Raj");
		System.out.println(stringJoiner);
	}
}
