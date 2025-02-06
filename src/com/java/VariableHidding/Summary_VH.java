/**
 * 1.What is variable hiding ?
 * ---------------------------
 * ->Creating a SV and NSV in PC and in CC with same name.
 * 
 *  2.Which variable value is read and modify ?
 *  -------------------------------------------
 *  ->It is depending on the referenced variable type
 *  	=>If we access SV and NSV by using super class reference,
 *  		super class value will be read and modify.
 *  
 *    	=>If we access SV or NSV by using sub class reference,
 *    		sub class variable value will be read and modify.
 *    
 *  3.How many ways we can differentiate PC variable from CC variables ?
 *  --------------------------------------------------------------------
 *  
 *  1.In CC SM -> 2 Ways -> PC name or PC reference variable
 *  2.In CC NSM -> 3 Ways -> PC name or PC reference variable or super KW
 *  3.In Other Class -> 2 Ways ->  PC name or PC reference Variable 
 */
package com.java.VariableHidding;

public class Summary_VH {

}
