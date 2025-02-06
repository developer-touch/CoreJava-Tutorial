/**
	Before Java 7V we must write code as shown below
*/

package com.java.java7newfeatures;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class TryWithResourceTest04{
	public static void main(String[] args){
		
		FileOutputStream fos1 = null;
		try{
			fos1 = new FileOutputStream("abc.txt");
			fos1.write('b');
			System.out.println("Data  Svaed successfully");
		}
		catch(FileNotFoundException fne){
			fne.printStackTrace();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		finally{
			try{
				if(fos1!=null)
					fos1.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
