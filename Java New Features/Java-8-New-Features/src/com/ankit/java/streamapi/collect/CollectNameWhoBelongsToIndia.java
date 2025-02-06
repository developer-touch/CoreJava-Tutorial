package com.ankit.java.streamapi.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectNameWhoBelongsToIndia {
	public static void main(String[] args) {
		System.out.println("CollectNameWhoBelongsToIndia.main()::main started");
		Persion p1 = new Persion("Ankit", "INDIA");
		Persion p2 = new Persion("John", "USA");
		Persion p3 = new Persion("Steve", "UK");
		Persion p4 = new Persion("Ching", "CHINA");
		Persion p5 = new Persion("Kumar", "INDIA");
		List<Persion> personList = Arrays.asList(p1, p2, p3, p4, p5);
		List<String> names = personList.stream().filter(p -> p.country.equalsIgnoreCase("india")).map(p -> p.name)
				.collect(Collectors.toList());
		names.forEach(name -> System.out.println(name));
		System.out.println("CollectNameWhoBelongsToIndia.main()::main ended");
	}
}
