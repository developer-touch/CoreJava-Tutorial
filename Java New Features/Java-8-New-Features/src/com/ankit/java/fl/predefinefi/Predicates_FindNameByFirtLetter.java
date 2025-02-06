package com.ankit.java.fl.predefinefi;

import java.util.function.Predicate;

public class Predicates_FindNameByFirtLetter {
	public static void main(String[] args) {
		String[] names = {"Ankit","Monu","Amit","Sonu","Anusha","Mahi","Kalu"};
		Predicate<String> p =  name -> name.charAt(0)=='A';
		for(String name : names) {
			if(p.test(name)) {
				System.out.println(name);
			}
		}
	}
}
