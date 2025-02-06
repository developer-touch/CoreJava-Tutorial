package com.java.ClassForName;
class  Demo{
	static {
		System.out.println("SB1 Executed");
	}

	Demo(){
		System.out.println("Demo Constructor");
	}
}
class Test extends Demo{

	static{
		System.out.println("SB2 Executed");
	}
	{
		System.out.println("NSB1 Executed");
	}

	Test(){
		System.out.println("Test Constructor");
	}

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("Test Main Executed");
		Test t = new Test();
		//Class.forName("Demo");
		Class.forName("Test");
	}
}

