package com.java.RecursiveMethAndConst;

public class RecursiveMethodAndConstructorTest {
int x = 5,y = 6;
	
	public static RecursiveMethodAndConstructorTest e1 = new RecursiveMethodAndConstructorTest();
	{
		System.out.println("Inittializer block");
		System.out.println(this.x);
		System.out.println(this.y);
	}
	public static void main(String[] args) {
		
	}
}
