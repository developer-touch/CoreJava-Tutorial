/**
	When we have abstract class for developing absrract why do we have inheritance ?
	--------------------------------------------------------------------------------
	=>Java doesn't support multiple inheritance by using classes for supporting multiple inheritance and 
	  for implementing multiple inheritance at a time by single class interface is given in java.

	Why java doesn't not support multiple inheritance by using class ?
	-------------------------------------------------------------------
	=>Because it leads ambigous to the compiler in calling and executing construcor and  method by using 
	  super keyword if both super class contains a method same signature.
*/

abstract class Vehicle{
	void printDetails();
}
abstract class Software{
	void printDetails();
}
class Tata extends Vehicle,Software{
	Tata(){
		super(); //A E
	}

	void showDetails(){
		super.printDetails();//A E
	}
}

/**
	This multiple inheritance ambiguous error is also called as diamond problem.

								Object 


				   Vehocle		     	    Software

								  Tata
*/
