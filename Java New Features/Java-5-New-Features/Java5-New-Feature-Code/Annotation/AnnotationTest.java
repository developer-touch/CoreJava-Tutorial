package com.annotation.programming;

import java.util.*;

public class AnnotationTest {

	private int a = 20;
	private int b = 30;

	@Override 
	public String toString(){
		return "a = "+a+", b = "+b;
	}
	public static void main(String[] args) 
	{
		AnnotationTest at = new AnnotationTest();	
		System.out.println(at);
		System.out.println("===============================");
		List list = new ArrayList();
		list.add("a");
		System.out.println(list);
	}
}
