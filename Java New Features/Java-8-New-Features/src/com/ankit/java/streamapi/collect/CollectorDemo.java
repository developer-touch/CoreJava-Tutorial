package com.ankit.java.streamapi.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorDemo {
	public static void main(String[] args) {
		System.out.println("CollectorDemo.main()::main started");
		Persion p1 = new Persion("Ankit", "INDIA");
		Persion p2 = new Persion("John", "USA");
		Persion p3 = new Persion("Steve", "UK");
		Persion p4 = new Persion("Ching", "CHINA");
		Persion p5 = new Persion("Kumar", "INDIA");
		List<Persion> personList = Arrays.asList(p1, p2, p3, p4, p5);

		List<Persion> indiaList = personList.stream().filter(p -> p.country.equals("INDIA"))
				.collect(Collectors.toList());
		indiaList.forEach(list -> System.out.println(list));
		System.out.println("CollectorDemo.main()::main ended");
	}
}

class Persion {
	String name;
	String country;

	public Persion(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Persion [name=" + name + ", country=" + country + "]";
	}

}