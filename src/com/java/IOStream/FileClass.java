package com.java.IOStream;

import java.io.File;
import java.io.IOException;

public class FileClass {
	public static void main(String[] args) throws IOException {
		File f1 = new File("Employee.txt");
		System.out.println(f1.exists()); //file not created
		System.out.println(f1.createNewFile());	//create a new file in PWD
		
		File f2 = new File("Product.txt");
		System.out.println(f2.exists());
		System.out.println(f2.mkdir());		//create new directory in PWD
		
		File f3 = new File(f2,"ProductName.txt");
		System.out.println(f3.exists());
		System.out.println(f3.createNewFile());
	}
}
 

