/**
	1.What is the interface and why interface ?
	-------------------------------------------
	=>Like a class , an interface is also a referenced data type.

	=>It is used fo representing the main type of the object by declaring
	  all its operation.
	
	=>The main purpose of interface is supporting multiple type inheritance.

	=>It supporting implementing multiple object operations in single class.
	
	=>An interface is a specifiaction or a contract document between user programmer
	  and sub type class programmers that specifies the operations those must be 
	  implemented by sub types and those must be accessed by user type.

	=>Its acts a mediator between user class and implementation classes developer by \
	  declaring operations of an object.
	
	For Example :->
	----------------

					Driver

					engine();		//calling the methods avilable
					weels();		//in super class by using super class type
					breaks();		//refernced variable by storing 
									//implementation class object

				interface Vehicle {	//meaditor between UC and Imple Classes
					engine();		//by declaring all operations of this object
					weels();
					breaks();
				}


				Bus				Car			Bike
				weels(){ }							//implementing the operations	
				engine(){ }							//as per thier requiement
				breaks(){ }
*/

interface Example {
	//void m1(){} 
	void m1();
	void m2();
}

class Sample implements Example{
	public void m1(){
		System.out.println("Sample m1");
	}

	public void m2(){
		System.out.println("Sample m2");
	}
}

class Test{
	public static void main(String[] args){
		Example e1;
		//e1 = new Example();

		e1 = new Sample();
		e1.m1();
		e1.m2();
	}
}