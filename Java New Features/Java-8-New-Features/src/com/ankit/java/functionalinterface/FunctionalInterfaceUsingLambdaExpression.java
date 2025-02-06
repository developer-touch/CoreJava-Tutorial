package com.ankit.java.functionalinterface;

@FunctionalInterface
interface CalculatorLambdaExpression {
	public abstract void calculate(int a, int b);
}

public class FunctionalInterfaceUsingLambdaExpression {
	public static void main(String[] args) {
		System.out.println("FunctionalInterfaceUsingLambdaExpression.main()::main started");
		
		// invoke the lambda expression to call functional interface
		CalculatorLambdaExpression calculate = (int a, int b) -> {
			System.out.println("Addition\t => " + (a + b));
			System.out.println("Subtraction\t => " + (a - b));
			System.out.println("Multiplication\t => " + (a * b));
			System.out.println("Division\t => " + (a / b));
			System.out.println("Modulus\t\t => " + (a % b));
		};
		calculate.calculate(60, 40);
		
		System.out.println("FunctionalInterfaceUsingLambdaExpression.main()::main ended");
	}
}
