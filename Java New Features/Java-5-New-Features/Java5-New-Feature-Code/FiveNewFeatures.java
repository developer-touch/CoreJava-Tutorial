/***                       
 * Java 5V New Features                           
 * -------------------------------------
 * 	1.AutoBoxing and AutoUnboxing
 * 	2.Generics
 * 	3.for-each loop / enhanced for loop
 * 	4.var-arg
 * 	5.enum
 *  6.annotation
 * --------------------------------------
 * 
 * 	#1:What is wrapper class, why wrapper class and How many wrapper classes ?
 * 
 * 	============================================================
 * 		PDT					WCs
 * 	============================================================
 * 		byte				Byte---------------\
 *	 	short				Short--------------  \
 * 		int					Integer------------	  \----->Number-------> Object
 * 		long				Long---------------   /                     /
 * 		float				Float--------------  /                     /
 * 		double				Double-------------/                      /
 * 		char				Character--------------------------------/
 * 		boolean				Boolean---------------------------------/
 * 																   /  	
 * 		void				Void ---------------------------------/		
 * 
 *  #2:Different operation we can perform by using WCs ?
 *  	#1: PV  -> WCO		-> constructor(PDT) or static valueOF(PDT)
 *  	#2: WCO -> PV 		-> wco.xxxValue()
 *  	#3: PSO -> WCO		-> constructor(String) or static valueOf(String)
 *  	#4: PSO -> PV 		-> static WC.parseXxx(String)
 *  	#5: WCO -> PSO		-> wco.toString() -> overridden in all WCs to return state of WC object.
 *  	#6: PV 	-> PSO		-> static WC.toString(PDT) -> WC own method
 *  
 *  #3:Compatibility of WC object 
 *  	1. ==   operator
 *  	2. equals() method
 *  
 *  #4:Boxing and UnBoxing
 *  
 *  #5:AutoBoxing and AutoUnboxing
 *  
 *  #6:Need of AB and AUB
 *  
 *  #7:Object pooling and value range
 */
package com.java.NewFeature5V;

public class FiveNewFeatures {
	public static void main(String[] args) {
		//#1:PV --> WCO    [50 -> Integer(50)]
		//=================================================================
		int i = 50;		//primitive value
		
		/**
		 * We can convert primitive value to WCO in two ways 
		 * 1.By new
		 * 2.By valueOf
		 */                                                 //primitive value as object
	
		long l1 = 50L;	//primitive value
		
		Long lo1 = new Long(50L);	          //primitive value as object
		Long lo2 = Long.valueOf(50L);		  //primitive value as object
		
		//#2:WCO --> PV		[Integer(50) -> 50]
		//=================================================================
		
		Integer io3 = new Integer(50);		  //primitive value as object
		int i3 = io3.intValue();			  //Integer object to PV
		
		Long lo3 = new Long(50L);			  //primitive value as object
		long l3  = lo3.longValue();			  //Long object to PV
		
		//#3:PSO -> WCO 	["50" -> Integer(50)]
		//==================================================================
		
		Integer io4 = new Integer("50");	  //PSO to WCO
		Integer io5 = Integer.valueOf("50");  //PSO to WCO
		int i4  = io4.intValue();
		
		Long lo4 = new Long("533545443");	  //PSO to WCO
		Long lo5 = Long.valueOf("284893843"); //PSO to WCO
		long l4 = lo4.longValue();
		
		//#4:PSO -> PV 	["50" -> 50 ]
		//==================================================================
		
		int i5  = Integer.parseInt("50");		//PSO to PV
		long l5 = Long.parseLong("837483493");	//PSO to pv
		
		//#5:WCO -> PSO 	[Integer(50) -> "50" ]
		//==================================================================
		
		Integer io6 = Integer.valueOf("50");
		
		System.out.println("Hello Ankit");
	} 
}
