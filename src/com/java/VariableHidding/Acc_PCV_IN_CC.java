/**
 * Q.How can we access super class variable in sup class and in Test class By differentiating them from sub class variable  ?
 * -------------------------------------------------------------------------
 * =>Accessing hidden variable (Super class variable ) by using super class type reference
 *   1.Either by using super class name
 *   2.By using super KW
 *   3.By using super class type reference variable
 *   
 * =>In Test class(other class) we can not use super KW we can use only either super class name or super class type reference variable.
 * 
 * Below program shows accessing super class variable in sub class.
 */
package com.java.VariableHidding;

public class Acc_PCV_IN_CC {
	static int a = 10;
	int x = 20;
}
