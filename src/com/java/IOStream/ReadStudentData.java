package com.java.IOStream;

import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadStudentData {
	public static void main(String[] args) throws FileNotFoundException,IOException {
		DataInputStream dis = new DataInputStream(new FileInputStream("Student.txt"));
		System.out.println(dis.readInt());
		System.out.println(dis.readUTF());
		System.out.println(dis.readUTF());
		System.out.println(dis.readDouble());
		System.out.println(dis.readLong());
		System.out.println(	dis.readUTF());
		System.out.println(dis.readChar());
		System.out.println(dis.readBoolean());
		
		dis.close(); 
	}
}
