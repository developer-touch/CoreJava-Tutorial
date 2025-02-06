/**
	Q.What is the need of method loacl inner class ?
	------------------------------------------------
	=>A method loacl inner class is used for creating an object specific to one peration.If we want 
	  to create a RWO in PW to be used only specific to one operation,then we must create this class 
	  inside this operation method.

	=>The object Gear is required to only move() operation of Car object so we must create 'class Gear'
	  as loacl Inner class (LIC) in the method move() as shown below.

	  class Car{
		  class Engine {
			  void start() { }
			   void move() {  
				   class Gear {
					   //method LIC specific to only move operation.
				   }
			   }
			   void stop(){ }
		  }
	  }
*/