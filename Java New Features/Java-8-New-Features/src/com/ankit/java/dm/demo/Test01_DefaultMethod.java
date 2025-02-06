package com.ankit.java.dm.demo;

interface I1{
	void m1();
	default void m2() {
		System.out.println("DM m2 from interface I1");
	}
}

interface I2{
	void m1();
	default void m2() {
		System.out.println("DM m2 from interface I2");
	}
}

class Example implements I1,I2{

	@Override
	public void m1() {
		System.out.println("AM is executed from class::Example");
	}

	@Override
	public void m2() {
		System.out.println("DM is executed from classs:Example");
	}
	
}

class Sample implements I1,I2{

	@Override
	public void m1() {
		System.out.println("AM is executed from class:Sample");
	}

	@Override
	public void m2() {
		I1.super.m2();
		System.out.println("DM is executed from class:Sample");
		I2.super.m2();
	}
	
}
public class Test01_DefaultMethod {
	public static void main(String[] ags) {
		System.out.println("main::method-start");
		P p1;
		//p1 = new P(); CE : P is abstract; can not be instantiate
		p1 = new Q();
		p1.m1();
		p1.m2();
		System.out.println();
		
		p1 = new R();
		p1.m1();
		p1.m2();
		System.out.println();
		
		p1 = new S();
		p1.m1();
		p1.m2();
		System.out.println();
		
		p1 = new T();
		p1.m1();
		p1.m2();
		System.out.println();
		
		p1 = new U();
		p1.m1();
		p1.m2();
		System.out.println();
		
		Example e = new Example();
		e.m1();
		e.m2();
		System.out.println();
		
		Sample s = new Sample();
		s.m1();
		s.m2();
		System.out.println("main::method-end");
	}
}
