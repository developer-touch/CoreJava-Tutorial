/**
	After Java 7V we must write code as shown below
*/

package com.java.java7newfeatures;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class TryWithResourceTest05{
	public static void main(String[] args){
		
		try(FileOutputStream fos = new FileOutputStream("B.txt")){
			fos.write('H');
			System.out.println("Data  Svaed successfully");
		}
		catch(FileNotFoundException fne){
			fne.printStackTrace();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		
	}
}
