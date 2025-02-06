class A{}
class B extends  A{}
/*
	-> We can extends an existing class to new class
*/
//class c implements class A{}

/*
	->We can't implements an existing class to new class
*/

interface I1{}
/*
	->We can extends an existing interface to new interface
*/

interface I2 extends I1{}
//interface I3 implements I1{}
/*
	->We can't implements an existing interface to new interface
*/

class D implements I1{}

//interface I4 extends A{}

class X{}
class Y{}

//class Z extends X,Y{}
 
class F implements I1 , I2{} 

class G extends X implements I1{}

//class H implements I1 extends X {}