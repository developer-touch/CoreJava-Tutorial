
/**
 * Develop a program to show the purpose of 
 * a data type to create variable, parameter & return type 
 *
 * Save this program as Test02.java in D:\01CJ\05DT
*/
package com.java.Datatype;

public class DataType_Test02 {
	public static void main(String[] args){
		//creating a variable to store value
		int i1 = 10;
		System.out.println(i1);

		//calling m1() for passing arg(value)
		m1(20);

		//calling m2() for taking value
		int i3 = m2();
		System.out.println(i3);
	}
	
	static void m1(int i2){ 
		System.out.println(i2);
	}
	
	static int m2(){
		return 30;
	}
};
