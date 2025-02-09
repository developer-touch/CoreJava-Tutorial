/**
	A class that is created inside another class is called inner class.
*/
class A{						//A.class
	class B	{	//inner class	//A$B.class

	}
}

/**
	For representing inner object of an outer object we will use inner class.
*/

class Car{				//Car			//Car.class
	class Engine{		//HAS-A			//Car$Engine.class
						//Engine
	}
}
class Person{				//Person	//Person.class
	class Heart{		//HAS-A			//Person$Heart.class
						//Heart
	}
}

/**
	Types Of Inner Class->
	----------------------
	1.static inner class
	2.non-static inner class
	3.local inner class
	4.anonymous inner class
			|->a sub class of another or
			|->an implementation of innterface
*/

class Example{										//Example.class
	static class A{	}		//static inner class			//Example$A.class
	class B	{  }			//non-static inner class		//Example$B.class

	void m1(){
		class C	{  }		//local inner class		//Example$1C.class
		class D	{  }		//local inner class		//Example$1D.class

		new Sample(){};		//anonymous inner class extending class	//Example$1.class
		new Sample(){};		//anonymous inner class extending class //Example$2.class
	}

	void m2(){
		class E	{  }		//local inner class		//Example$1E.class
		class F	{  }		//local inner class		//Example$1F.class
		
		new Sample(){};		//anonymous inner class extending class		//Example$3.class 
		new Sample(){};		//anonymous inner class extending class		//Example$4.class
		
		Sample s1 = new Sample();	//Sample class Object
		System.out.println(s1);

		Sample s2 = new Sample(){}; //AIC extending Sample
		System.out.println(s2);
	}

	void m3(){
		Sample s3 = new Sample(){
			@Override
			void m1(){
				System.out.println("AIC m1");
			}
		};

		System.out.println(s3);
		s3.m1();

		/**
			An AIC performs 3 operations in single statement
			1.creates sub class from the given class/interface
			2.override  or implements this class/interface mthods
			3.creates objects of this implementation class
		*/
	}
}

class Sample{
	void m1(){System.out.println("Sample m1");}
}

class TestInnerClassDemo{
	public static void main(String[] args){
		Example e = new Example();
		e.m1();
		e.m2();
	}
}
/**
	Q.How can we access static inner class and its members ?
	-----------------------------------------
	1.SV ->By using outerclass.innerclass name we can access inner class SV	(P.Q.a)
	2.SM ->By using Outerclass.Innerclass name we can access inner class SM	(P.Q.m1())
	
	3.Constructor ->By using Outerclass.Innerclass then object is created	(P.Q q1 = new P.Q())
	
	4.NSV ->By using innerclass object reference variable(q1.x)
	5.NSM ->By using innerclass object reference varibale(q1.m2())

*/
class P{
	static class Q{			//static inner class
		static int a = 10;	//inner class static variable
		int x = 20;			//inner class non-static variable

		static {			//inner class SB
			System.out.println("Q SB");
		}

		Q(){				//inner class constructor
			System.out.println("Q NPC");
		}

		static void m1(){	//inner class SM
			System.out.println("Q SM");
		}
	
		void m2(){			//inner class NSM
			System.out.println("Q NSM");
		}
	}
}

class ExecutionOfSIC{
	public static void main(String[] args){
		//System.out.println(Q.a);	CE : C F S Q

		System.out.println(P.Q.a);		//OC.IC.static member
		P.Q.m1();					

		P.Q q1 = new P.Q();				//Inner class Object.static member
		
		System.out.println(q1.x);		//accessing inner class NSV
		q1.m2();						//accessing inner class NSM
	}
}