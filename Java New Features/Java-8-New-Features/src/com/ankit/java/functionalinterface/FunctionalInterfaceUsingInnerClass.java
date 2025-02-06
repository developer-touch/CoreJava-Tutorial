package com.ankit.java.functionalinterface;

@FunctionalInterface
interface Calculator {
	public void caluculate(int a, int b);
}

public class FunctionalInterfaceUsingInnerClass {
	public static void main(String[] args) {
		System.out.println("FunctionalInterfaceUsingInnerClass.main()::main started");
		
		Calculator calculator = new Calculator() {

			@Override
			public void caluculate(int a, int b) {
				System.out.println("Addition\t => "+(a+b));
				System.out.println("Subtraction\t => "+(a-b));
				System.out.println("Multiplication\t => "+(a*b));
				System.out.println("Division\t => "+(a/b));
				System.out.println("Modulus\t\t => "+(a%b));
			}
		};
		
		calculator.caluculate(20, 10);
		System.out.println("FunctionalInterfaceUsingInnerClass.main()::main ended");
	}
}
