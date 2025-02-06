/*
 * Duplicate Variable 
 * -------------------
 * ->A variable that is declared with an existing variable name
 *   in the same scope is called duplicate variable.
 *   
 * ->Here we must consider only variable name we no need other parts
 *   either value to data or modifier.
 */
package com.java.DV_VS_LV;

public class DV_Test01 {
	static int a = 10;
	//static int a = 20;	DV
	//static double a = 10.0; DV
	//static String a = "ankit"; DV
}