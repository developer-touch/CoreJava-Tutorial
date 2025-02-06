package com.java.reflectionapi;

import java.util.Scanner;

public class Test02_DynamicLoading {
	public static void main(String[] args) throws ClassNotFoundException ,
													InstantiationException,IllegalAccessException{
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter class name :: ");
		String className = scn.next();
		
		Class cls = Class.forName(className);
		
		Object obj = cls.newInstance();
		
		System.out.print(obj);
	}
}
