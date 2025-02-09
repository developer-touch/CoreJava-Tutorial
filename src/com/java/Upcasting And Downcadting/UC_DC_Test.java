class A{
	int x = 10;
}

class B extends A{
	int y = 20;
}

class C extends B{
	int z = 10;
}

class D{
	
}

class Test_UCDC{
	public static void main(String[]  args){
		
		//Upcasting
		A a1 = new B();

		//Downcasting
		B b1 = (B)a1;
	
		//Upcasing rule(AC/IC/W)(=operator)
		Object o1 = new Object();
		Object o2 = new A();
		Object o3 = new B();
		Object o4 = new C();
		Object o5 = new D();

		//Downcastinng rule(casting/EC/Na)(cast)(operator)

		A a2 = new B();
		B b2 = (B)a2;
		//C c2 = (C)a2;
		//D d2 = (D)a2;

		//Identify CE and RE in below Statement
		
		Object o6 = new B();

		A	a3 = (A)o6;
		B	b3 = (B)o6;
		//C	c3 = (C)o6;
		//D	d3 = (D)o6;

		//Identify CE and RE in below Statement

		A	a4 = new C();
		C	c4 = (C)a4;
		//C   c5 = (B)a4;
		//C	c6 = (A)a4;

		//Can we use multiple cast operator in single expression ? ->Yes

		//Identify CE and RE in below Statement

		A a5 = new C();
		B b5 = (B)(A)(C)(B)a5;
		//B b6 = (C)(A)(D)(C)(B)a5;
		//B b7 = (B)(A)(Object)(D)(Object)(C)(B)a5;

		//Is casting reqiurement in below statement

		B b8 = new B();
		Object o7 = b8;
		Object o8 = (Object)b8;
	}
}
