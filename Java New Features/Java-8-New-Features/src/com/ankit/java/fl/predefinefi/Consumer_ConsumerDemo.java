package com.ankit.java.fl.predefinefi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_ConsumerDemo {
	public static void main(String[] args) {
		
		Consumer<String> consumer = (name)->System.out.println(name+" Good Morning");
		consumer.accept("Ankit");
		consumer.accept("Mahi");
		consumer.accept("Tanu");
		
		List<Integer> numberList = Arrays.asList(10,20,30,40,50,60);
		numberList.forEach(i->System.out.println(i));
	}
}
