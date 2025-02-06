package com.java.IOStream;

import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WriteStudentData {
	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("Student.txt"));
		dos.writeInt(101);
		dos.writeUTF("Ankit");
		dos.writeUTF("Core Java");
		dos.writeDouble(3500);
		dos.writeLong(9135660261L);
		dos.writeUTF("ankit@1234");
		dos.writeChar('M');
		dos.writeBoolean(true);
		dos.flush();
		
		System.out.println("Student Records Saved...");
	}
}
