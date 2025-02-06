package com.java.java7newfeatures;
import java.io.*;
import java.sql.*;

class TryWithResourceTest05{
	public static void main(String[] args){
		//Rule #1: The resource's variable and object both must be AutoClosable type
		/**
			try(PrintStream ps = new PrintStream(System.out)){
				ps.println("hello");
			}

			try(String s = "a"){ } CE: I C T

			try(Object obj = new PrintStream(System.out){ } CE: I C I

			try(AutoClosable ac = new PrintStream(System.out)){ }  CE: u r e Exception must handle
		*/ 


		
	}
}
