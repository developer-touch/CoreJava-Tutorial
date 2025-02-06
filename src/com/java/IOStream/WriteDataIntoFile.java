/**
 * 	What is Stream ?
 *  =>Stream is a logical connection between java program and a file.
 *  
 *  =>To store data in the persistence media there should be a way to connect
 *    to persistence media from java application either physically or logically.
 *    
 *  =>Stream provides logical connection.
 *  
 *  #.Develop a program to read data from a file .
 */
package com.java.IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataIntoFile {
	public static void main(String[] args) throws FileNotFoundException ,IOException {
		FileOutputStream fos = new FileOutputStream("ABC.txt");
		fos.write(97);			//97 1 byte (as int number )
		fos.write('b');	
		//fos.write("Ankit");	//
		fos.write("Ankit".getBytes());
		fos.write(5000);
		System.out.println("Data Svaed..");
	}
}
 