package com.ankit.java.fl.predefinefi;

import java.util.function.Function;

public class Function_FuntionDemo {
	public static void main(String[] args) {
		Function<String, Integer> function = (name)-> name.length();
		System.out.println(function.apply("Ankit"));
		System.out.println(function.apply("Shivansh"));
		System.out.println(function.apply("Organization"));
	}
}	
