/**
	
	Final KW =>
	-----------
	->The kw final is a modifier kw.

	->It is used for creating ,
		final variable,final method,final class nothing but constants

	->If we want to stop modifying variable value,
	->If we want to stop overriding method in sub class
	->If we want to stop creating sun class from a class
		we must declare the varibale , method and class as final.

	->The kw final is allowed -
		1.To all 4 types of variable
		2.To the concrete method(SM & NSM, not abstract method)
		3.To the concrete class not abstract class.

	# About Final Variable =>
	------------------------
	->A varibale that is declared with kw final is called final variable.

	->It means once we store a value 

		EX :->
			final int x;
			x = 10;

	->A variable is used for storing a fixed/constant value  .

	->Jt means once we store a value, if we do not want to modify the variable value,
	  we must declare it as final.

	  	EX :->
			final int x;
			x = 10;

			//x = 20; CE:

			Ex :->aadhaar,pan,voterid,dob

			->The meaning conversion to create the final variable,all character must be capatial and word must be sparated by _

			AADHAAR,PAN,VOTER_ID,DOB,MIN_BALANCE
	
	->We can declare all 4 type of varibale SV,NSV,P and LV as final .

	Below program shows create all 4 type of variables as final and modifying their values.
	
*/
class FinalKW
{
	static final int a = 10;			//FSV
	final int x = 20;					//FNV

	void m1(final int p){				//FPV
		final int q = 40;				//FLV
	
		//a = 15;
		//x = 25;
		//p = 35;
		//q = 45;
	}
}
/*
	Rule #1:->All 4 types of final variable can't be modified.

	Rule #2:->The static final variable and non-static final variable must be initialized,
				else we will get CE
			 
			 ->The parameter final and local final no need to initialized.

	Below program show the above rule #2.
*/

class Sample {

	//static final int a;
	//final int x;

	void m1(final int p){
		final int q;
	}

}

/*
The reason for Rule #2:
- The SV and NSV are meant for storing values common to 
  all methods of the current class. Then the final value/constant value 
  to be stored in SV and NSV must be decided before methods execution is started. 
  Hence SFV and NSFV must be initiaized before those variables are 
  ready to be accessed.

- The paramter and LV are meant storing a value specific to this current method
  operaiton. Then those variables values are need to be decieded by this current 
  method developer. Hence LFV can be initialized just before it is beeing used.

- A SFV must be initialized before class loading is completed
- Hence a SFV can be initialized
	1. either	in its declaration statement 
	2. or		in 'any one of' the static blocks

- Below program explains SFV initialization

*/
class A {
	static final int a = 10;
	static final int b;

	//static final int c;
	//static final int d;

	static {
		//a = 15;
		b = 20;
	}
	static {
		//b = 25;
	}
	static void m1(){
		//c = 30;
	}
	public static void main(String[] args){
		//d = 30;
	}
}

/*
	->A NSFV must be initialized before object creation is completed
			=>Hence a NSFV can be initialized 
			1.either in its declaration
			2.in any of the NSB
			3.in all constructor those doesn't have this() call.
	
	->If the constructor has this() call,we can't initialize NSFV because it is initialized from the this() calling constructor.

*/

class A2{
	final int x = 10;
	final int y;
	final int z;

	{
		//x = 10;
		y = 20;
	}
	{
		//y = 25;
	}
	A2(){
		z = 30;
	}
	A2(int x){
		z = 40;
	}
	A2(String s){
		z = 50;
	}
}

/*
	What is the right place to initialize SFV and NSFV ?
	---------------------------------------------------

	SFV :->
	------
		->Initializing SFV in its declaration statement is not good programming because it contain same value all time.

		->Rigth approch to initialize SFV is its value dynamically from the KB or from file or from DB.

	NSFV :->
	--------
		->Initializing NSFV in its declaration statement is not good programming because in all object this NSFV contain
		  smae value.When NSV conatain same value in all object,declaring its as static is best choice, so that memory
		  and time will be saved.

		->Declaring a NSV as final is meant for storing different constant value from one object to another object.

		->Hence, the right approch to initialize NSFV is 
			1.either in NSB by reading its value dynamically from KB or fromm file or from DB.
			2.or in the overloaded constructors, 
			
		so that NSV can contain different containt value in diifrent object
		based on object creation programmer choice.
*/

/**
	RRR(Read,Replace and Remove) on final Variable =>
	================================================

	->If we declare a vriable as final "with initialization' when we read this final variable value in the next lines of code,
	  whenever we access, there compiler replace this variable name with its assigned value directly and removes variable 
	  decclaration as show in this below program.
*/

class A3{
	public static void main(String[] args){
		final int p = 10;
		System.out.println(p);
	}
}

/*
A3.class
class A3{
	public static void main(String[] args){
		System.out.println(10);
	}
}
*/

/**
	=>RRR is applied only when the final variable is intialized
	  1.In the same declaration line
	  2.With Literal(Constant)

	=>If final variable is 
	  1.Not initialized or
	  2.Initialized in the next line or
	  3.Initialized with a variable or with an expression or with method call

	  the compiler doesn't know final variable value,
	  hence it will not apply RRR.

	  It leaves the variable declaration and variablr accessing stmt as it in the program.

	  then at runtime JVM allocates memory to  FV, stores
	  given value,then reads the FV value.

	  Below Program explains above points
*/

class A4{
	public static void main(String[] args){
		final int p;

		p = 10;

		System.out.println(p);

		int x = 20;

		final int q = x;

		System.out.println(q);
		
	}
}

/**
	RRR is not applied to NSFV and final param, because 
		-> the param value is decided at run time at the time of method call.

		->the NSFV is specific to one object and it is provided memory and its
		  value is available to access only after object creation.

	Hence compiler doesn't know final param value and NSFV value to apply RRR.

	RRR can be applied on SFV because it has only one copy memory.

	RRR points on SFV ->
	--------------------
	=>If we access SFV value in another class,
	  its class in not loaded, directly SFV value is printed

	=>Here also compiler replaces SFV name with its value.

	=>Hence JVM doesn't know loading SFV class.

	As show in below program
*/

class A5 {
	static final int a = 10;
	static {
		System.out.println("A5 SB");
	}
}

class Test_Accessing_ClassLoading{
	public static void main(String[] args){
		System.out.println("Main Start");
		System.out.println(A5.a);
		System.out.println(A6.a);

	}
}

class A6{
	static final int a;		//If SFV is not initialized in the same line the RR is applied 
	static {
		System.out.println("A6 SB");
		a = 20;
	}
}

/**
	Below explains whether SFV is initialized with DF value or not
*/

class A7{
	static {
		//System.out.println("From DB a :"+a);
		System.out.println("From SB a :"+A7.a);
	}

	static final int a = 10;

	public static void main(String[] args){
		System.out.println("From mm a : "+a);
	}
}

class A8{
	static{
		System.out.println("From SB a :: "+A8.a);
	}

	static final int a;

	static{
		a = 20;
	}

	public static void main(String[] args){
		System.out.println("From MM  :: "+a);
	}
}