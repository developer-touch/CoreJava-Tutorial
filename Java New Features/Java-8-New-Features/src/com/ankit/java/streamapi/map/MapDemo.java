package com.ankit.java.streamapi.map;

import java.util.Arrays;
import java.util.List;

public class MapDemo {
	public static void main(String[] args) {
		System.out.println("MapDemo.main()::main started");
		List<String> countryList = Arrays.asList("india", "usa", "uk", "japan", "china");
		countryList.stream().map(country -> country.toUpperCase()).forEach(list -> System.out.println(list));
		countryList.stream().map(country -> country.length()).forEach(length -> System.out.println(length));
		System.out.println("MapDemo.main()::main ended");
	}
}
