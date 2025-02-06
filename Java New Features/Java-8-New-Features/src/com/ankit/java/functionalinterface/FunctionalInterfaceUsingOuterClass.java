package com.ankit.java.functionalinterface;

@FunctionalInterface
interface Addition {
	public void add(int a, int b);
}

class AdditionImplementation implements Addition {
	public AdditionImplementation() {
		System.out.println("AdditionImplementation::0-param connstructor");
	}

	@Override
	public void add(int a, int b) {
		System.out.println("Addition => " + (a + b));
	}

}

public class FunctionalInterfaceUsingOuterClass {
	public static void main(String[] args) {
		System.out.println("LambdaExpressionUsingOuterClass.main()::main stated");

		Addition add = new AdditionImplementation();
		add.add(10, 20);

		System.out.println("LambdaExpressionUsingOuterClass.main()::main ended");
	}
}
