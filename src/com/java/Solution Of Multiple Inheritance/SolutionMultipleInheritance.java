/**
	How can interface solve multiple inheritance problem ?
	------------------------------------------------------
	1.interface doesn't have constructor 
	2.interface contains only abstract method, it must be override in sub class
	3.in sub class super keyword doesn't reference to interface, it refer to the one and 
	  only the super class

*/

/**
	Without abstract method we can't override super class(interface class) in sub class.
	so we declared this method as abstract mehtod.
*/
interface Vehicle {
	abstract void printDetails();
}

interface Software {
	abstract void printDetails();
}

/**
	Here we implements multiple inheritance through interface because class doesn't support.
*/
class TATA implements Vehicle,Software{

	/**
		Here,printDetails method must we public because we override interface method in sub type class
		and interface method is decclared as public so we must declare as public method.
	*/

	public void printDetails(){		
		System.out.println("Executed From TATA");
	}

	/**
		Here, we are calling super class Object class constructor because interface doesn't suppor constructor.
	*/
	TATA(){
		super(); //calls super class object constructor.
	}
	
	/**
		Calling interface class method in sub its sub type class.
	*/
	public void showtDetails(){
		printDetails();
	}
}	