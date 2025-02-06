/**
 * 6.How many ways we can create String object ?
 * 		:=>In 2 ways ---
 * 			1.By using String literal
 * 			2.By using new 
 * 
 * 7.What are the differences in above two approach ?
 * 		:=>We have 2 differenced		Literal					new KW
 * 		   1.Number Of Object			 0 or 1			       1 or 2
 * 		   2.String pooling			     yes				    no
 * 	
 * 		:=>In literal approach one object is created 	[literal]
 * 		:=>In new KW  approach two object is creates	[literal+new KW]
 * 	
 * 		:=>Literal object comes under pooling
 * 		:=>new KW object doesn't comes under pooling.
 * 
 *  	:=>String pooling means "grouping String literal object and reusing".
 *  
 *  	:=>If we repeat same literal object with same case characters only one object is created
 *    	   from second onwards the same first object is reused.
 *    
 *    	:=>Whereas in new KW approach,every time new object is created even through data is same.
 *    
 * 8.Which Approach is best?
 * 		:=>You can not compare them because their purpose is different 
 * 		
 * 		:=>For creating very first String object, we must use String literal approach.
 * 		
 * 		:=>For copy string data from one String to new String object we must use new KW approach.
 * 
 * 9.Which approach String object is EGC ?
 * 		:=>Literal object is not for EGC.
 * 		:=>new KW object is EGC.
 * 
 * 10.Is String pooling really giving benefits ?
 * 		:=>The advantage with string pooling is the number of String object creation is decrease.
 * 	
 * 		:=>But here problem is literal object are not egc so their memory is never destroyed,if we 
 *         create more literal object is a chance to get OOME.
 *         
 *      :=>Due to this error, new KW String object are not added to pool.
 *		
 */ 
package com.java.StringHandlingProject;

public class Test02_StringObject {
	public static void main(String[] args) {
		String s1 = "Ankit";	//1
		String s2 = "Ankit";	//0
		System.out.println(s1==s2);	//true
		
		String s3 = new String("NIT");	//2
		String s4 = new String("NIT");	//1
		System.out.println(s3==s4); //false
		
		String s5 = "Hyd";		//1
		String s6 = new String("Hyd");	//1
		String s7 = new String("Hyd");	//1
		
		String s8 = "TG";
		s8 = null;
		System.gc();
		
		String s9 = new String("ABC");
		s9=null;
		
		System.gc();
		
		
	}
}
