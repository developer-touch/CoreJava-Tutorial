/***
 * 1.What is the Reflection API and use of Reflection API ?
 * -------------------------------------------------------
 * 		=>Reflection API is the group of classed that meant for 
 * 			1.Loading the class
 * 			2.Instantiating the class
 * 			3.Accessing member of a class dynamically by reading class name from KB/from file 
 *            are together is called Reflection API.
 *            
 * 2.What are the classes comes under Reflection API ?
 * ---------------------------------------------------
 * 		1.Class					6.Modifiers
 * 		2.Filed					7.Annotation
 * 		3.Constructor			8.Package
 * 		4.Method				9.Module
 * 		5.Parameter
 * 		
 * 		->Among all above classes the main class is Class.
 * 
 *   	->It provides the basic methods for Loading and Instantiating a class. 
 *   
 * 3.In which package those classes are organize ?
 * -----------------------------------------------
 * 		=>Reflection API classes are placed in three pacakge
 * 			1.java.lang
 * 			2.java.lang.reflect
 * 			3.java.lang.annotation
 * 
 * 		=>The classes Class and Package are defined inside java.lang package
 * 
 * 		=>The class Annotation is defined inside the java.lang.annotation
 * 
 * 		=>The classes Filed,Constructor,Method,Parameter,Modifiers are defined
 *   	  in java.lang.reflect package.
 *   
 *   	=>If we want to Field,Constructor,Method,Modifier classes,we must add import 
 *   	  java.lang.reflect.*; in our java file.
 *   
 *   	=>If we want to use Annotation class, we must add import java.lang.annotation.*;
 *        in our java file.
 *        
 *      =>else compiler will throw error : c f s
 *      
 *      =>We no need to add import statement for the classes Class and Package because they
 *        are available inside java.lang package compiler will add its imort statement.
 *        
 * #.To develop programs for loading, instatantaiting ,reading information of a loaded class 
 *   and its members dynamically by using reflection API, we must know the method available
 *   inside above 8 classes.
 *   
 *   4.Method for loading and instantiating a given class dynamically ?
 *   ------------------------------------------------------------------
 *   
 *   	1.For loading the class 
 *   	
 *   	       public static Class forName(String clsName) 
 *                           -----------------------------							
 *   											throws ClassNotFoundException
 *   
 *   	2.For instantiating the loaded class
 *   		
 *   		   public Object newInstance()
 *   					  ----------------
 *   							throws InstantiationException,
 *   								   IllegalAccessException
 *   
 * 	5.How can we pass class name dynamically to forName() method ?
 * 	--------------------------------------------------------------
 * 		=>By using Scanner class method we must read class name eithetr from
 * 		  KB or from file , then pass this class name to forName().
 * 
 * 		Sample code :->
 * 			1.Reading ClassName  -> String clsName = scn.nextLine();
 * 			2.Loading cls byte code -> Class class = Class.forName(clsName);
 * 			3.Instantiating class -> Object object = class.newInstance()
 * 				  
 * 
 * 	6.Different betwwen new KB and reflection API ?
 * 	-----------------------------------------------
 * 		=>'new' KB based object creation is static in nature it means we can 
 * 		  not change current class to another class object creation without 
 *        modifying code and recompiling.
 *        
 *        For Example :->
 *        		
 *        		new A();  :-> here we can't not change the class A to class B 
 *        					  always above stmt will creaete class A object only.
 *        
 *     	=>'Reflection' API based object creation is dynamic in nature.It means we 
 *     	  can change current class to another class object creation without modifying
 *        code and recompiling.We can just pass class name st execution time as input
 *        to reflection API method, then which ever the class name we pass that class
 *        is loaded and object is created .
 *        
 *        For Example :->
 *        		
 *        		Class.forName(scn.nextLine()).newInstance(); :-> passing classname from KB
 *        
 *        
 *	7. new A() :-> Load class A byteCode into JVM 
 *			   :-> Creates instance of class A with NSV memory DVs
 *			   
 *             :->Initializes current object with its internal logic
 *             
 *  8.Class.forName(cls)  :-> Load class A byteCode into JVM 
 *		cls.newInstance() :-> Creates instance DVs 
 *						  :->Invoke NP constructor 
 *			   			  :->Initializes object as per internal logic
 */
