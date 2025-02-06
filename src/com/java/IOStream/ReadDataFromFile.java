package com.java.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromFile {
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileInputStream fis = new FileInputStream("ABC.txt");
	
		int data1 = 	fis.read();
		int data2 = 	fis.read();
		int data3 = 	fis.read();
		int data4 = 	fis.read();
		int data5 = 	fis.read();
		int data6 = 	fis.read();
		int data7 = 	fis.read();
		int data8 = 	fis.read();	
		int data9 =     fis.read();
		
		System.out.println(data1+" "+(char)data1);
		System.out.println(data2+" "+(char)data2);
		System.out.println(data3+" "+(char)data3);
		System.out.println(data4+" "+(char)data4);
		System.out.println(data5+" "+(char)data5);
		System.out.println(data6+" "+(char)data6);
		System.out.println(data7+" "+(char)data7);
		System.out.println(data8+" "+(char)data8);
		
	}
}
