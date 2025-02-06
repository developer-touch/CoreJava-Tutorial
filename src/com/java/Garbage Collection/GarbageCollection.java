/**
	Garbage Collection 
	------------------
	1.What is garbage collection ?
	  ->The process of destroyed unreferenced or unused objects from JVM from Heap Area 
	    is called garbage collection.

	Here grabage means				-> unreferenced object
	Here garbage collection means	-> removing or deleting 

	2.Why garbage collection ?
	 ->For destroyed unreferenced object from Heap area and makin heap area free for 
	   creating new object .

	3.What will happen we do destroy object ?
	  ->It leads to an exception OOME.

	  ->If we don't destroy unreferenced object from heap area at somme point of time
	    heap area is filled, we can't create new object and then JVM is terminated with
		an exception java.lang.OutOfMemoryException(OOME).
	
	4.Who is responsible to do garbage collection ?
	  ->JVM is responsible to do garbage collection, means destroying object unreferenced
	    obejct.

	5.What is the responsiblity of a developer ?
	  ->In java,Developer is only responsible for 
	    1.creating object
		2.using that object for representing operation 
		3.finally unreferenced objects after its usage.

	 ->When we unreferenced an object,JVM will take care of destroying those unreferenced
	   object implicitly.
	
	6.What is the meaning automatic memeory management ?
	  ->Garbage collection is also called as automatic memeory management because the object
	    are destroyed automatically by JVM .

	7.How can JVM do garbage collection ?
	  ->By using garbage collector (GC)

	8.What is GC , why GC ?
	  ->A garbage collector is a low priority daemon thread.
	  ->It is used for destriyed unreferenced or unused object from heap area to avoid OOME.

	9.Who will start gc and when will start gc ?
	  ->JVM will start gc ,when heap memeory is running low.

	10.Will JVM runs gc definity when heap running low ?
	   ->No guarentee

	11.Can we forced JVM to start gc ?
	   ->No,we can force
	   ->We can only request

	12.How can we request JVM to start gc >
	   ->By calling the gc() method available inn either runtime class or in System.

	   1.Rutimme.getRuntime().gc();
	   2.System.gc();

	   ->System.gc() internally calls Runtime.getRuntime().gc();

	13.How can we confirm an object is destroyed by gc ?
	   ->We must override finalized() method in sub class
	   ->We must place the required logic in it.

*/
package com.java.GarbageCollection;
