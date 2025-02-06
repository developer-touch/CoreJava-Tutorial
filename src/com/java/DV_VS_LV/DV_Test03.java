/* 
	1. In a single class, we can not create
		- two static variables,
		- two non-static variables
		- static and non-static variables
	   with same name, it leads CE

	2. In a single method, we can not create
		- two parameters,
		- two local variables,
		- a parameter and local variable
 	   with same name, it leads CE

	3. We can create a variable at class level and 
	   at method level with same name.
		- a local variable or parameter name can be same as
	    static variable or non-static variable name, no CE

	4. In different methods we can create parameters and local variables 
	   with the same name.

	5. int a = 10; and a = 20; are allowed
	   because a = 20; is not creation it is accessing
*/
package com.java.DV_VS_LV;

public class DV_Test03 {
	static int a = 10;
	//static int a = 20;
}

class B{
	int a = 10;
	//int a = 20;
}

class C{
	static int a = 20;
	//int a = 20;
}

class D{
	static int a = 10;

	static void m1() {
		int a = 10;
	}
	
	static void m2() {
		int a = 20;
	}
	
	static void m3() {
		int a = 10;
		//int a = 20;
	}
	
	static void m4() {
		int a = 10;
		a = 11;
	}
	
	static void m5(int a) {

	}

	static void m6(int a) {

	}

	//static void m7(int a, int a) {

	//}

	static void m8(int a) {
		//int a = 10;
	}

	static void m9(int a) {
		a = 70;
	}

	static void m10() {
               
		System.out.println(a);
	}
}