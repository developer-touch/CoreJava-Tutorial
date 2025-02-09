/**
	Final Method ->
	---------------
	=>A method that is declared with the kw final is called final method.

	=>When we don't what to 'hide or override' super class method in sub class we  must declare that method 
	 in super classs as final.

	=>If we want to 'force' all sub classes to use the same logic of a method , we must declared as final.

	=>For Exmaple :->
			getBankName(),getBranchName(),getIfsc() method logic is same for all banks,hence we must declared these 
			3 methods as final to stop hidding or overriding them in sub classes.
	
	=>Rules on final methods
	------------------------
	1.We can't hide or overrride super class final method in sub class but
	  We can declare both static and NS method as final.

	Below program shows creating final method
*/
class A
{
	static final void m1(){
		System.out.println("A m1");
	}

	final void m2(){
		System.out.println("A m2");
	}

	static void m3(){
		System.out.println("A m3");
	}

	void m4(){
		System.out.println("A m4");
	}
}

class B extends A{
	//static void m1(){
	//	System.out.println("B m1");
	//}
	//void  m2(){
	//	System.out.println("B m2");	
	//}

	static void m3(){
		System.out.println("B m3");
	}

	void m4(){
		System.out.println("B m4");
	}
}

class C extends A{
//	static void m1(){
//		System.out.println("C M1");
//	}
//
//	void m2(){
//		System.out.println("C m3");
//	}
	
	static void m3(){
		System.out.println("C m3");
	}

	void m4(){
		System.out.println("C m4");
	}
}

class Test_FinalMethod{
	public static void main(String[] args){
		B b1 = new B();
		b1.m1();
		b1.m2();
		b1.m3();
		b1.m4();

		C c1 = new C();
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4();

		D d1 = new D();
		d1.m3();
		d1.m4();
	}
}
class D extends A{
	static  void m3(){
		System.out.println("D m3");
	}
	void m4(){
		System.out.println("D m4");
	}
}

class D1 extends A{
	static final void m3(){
		System.out.println("D m3");
	}
	final void m4(){
		System.out.println("D m4");
	}
}

class E extends A{
	static final void m3(){
		A.m3();
	}

	final void m4(){
		super.m4();
	}
}

class E1 extends D1{
	//static void m3(){}
	//void m4(){}
}
