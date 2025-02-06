/**
 * Variable Hiding =>
 * =================
 * 
 * =>Like method we can also create super class SV and NSV in sub class.
 *   This concept is called Variable Hiding.
 *   
 * Q.What is a variable Hiding ?
 * ----------------------------
 * =>Create a SV and NSV in super class and in sub class with same name 
 *   is called VH.
 *   
 * =>It is called VH because when we access those SV and NSV in sub class or by 
 *   using sub class reference, the variable value is read and modify in sub class
 *   memory.
 *   
 * =>It means sub class variable hides the sup class variable.
 */
package com.java.VariableHidding;

public class Variable_Hidding_Testo1 {

	static int a = 10;
	int x = 20;
	
}
