/**
	Q. When we must create Non-Static inner class or Its Member Class ?
	-----------------------------------------------------------------
	->For accessing inner class object of an outer class object specific to one instance
	  this outer class or outer object or to access IC by using an object of its outer
	  class we must create non-static inner class.

	->For Example each instance of a car object must contains its own Engine object.Hence
	  we must create the class Engine as NSIC in the class car .

	  class Car {
		  //static class Engine{ the meaning of this code is  one engine common to all cars, Wrong Design
		  }
	  }

	  class Car {
		  class Engine {
			//the meaning is this code is one Engine separately for each car, this is correct design
		  }
	  }

	->NSIC is just like a NSV and NSM

	Q.How can we access NSIC ?
	---------------------------
	Outerclassname.NSICname

	Q.How can we create NSIC object ?
	----------------------------------
	->We must create NSIC object.

	->For creating NSIC object , first of all we must create its OC object.
		
		Outerclass Object.Innerclass Object 

		OC ac = new OC();  //Outer class Object 

		OC.IC ic = new oc.new IC(); //IC object specific to OC object OC
				
					(OR)

		OC.IC ic = new OC().new IC();

	Q.How can we access NSIC Members ?
	---------------------------------

	SMs -> OC.IC.StaticMembers 

	NSIC ->NSICObject.non-staticMembers

*/

class OuterClass{
	class InnerClass{
		static int a = 10;
		int x = 10;

		static {
			System.out.println("IC SB");
		}

		InnerClass(){
			System.out.println("IC NPC");
		}

		static void m1(){
			System.out.println("IC SM");
		}

		void m2(){
			System.out.println("IC NSM");
		}

		public static void main(String[] args){
			System.out.println("IC MM");
		}
	}
}

class RunNSIC{
	public static void main(String[] args){
		System.out.println(OuterClass.InnerClass.a); //access SMa Of NSIC

		OuterClass.InnerClass.m1();
		System.out.println();

		//OuterClass.InnerClass.m2();

		OuterClass.InnerClass ic = new OuterClass().new InnerClass(); //Creating NSIC object specific to one OC object

		System.out.println(ic.x);
		ic.m2();
	}
}