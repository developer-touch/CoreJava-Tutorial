class Test09 {
	static Example e;
	void m1(){
		e = new Example();
	}
	void m2(){
		Example e = new Example();
	}
	public static void main(String[] args) {
		Test09 t1 = new Test09();	t1.m1();		
		Test09 t2 = new Test09();	t2.m1();		
		Test09 t3 = new Test09();	t3.m1();		

		System.out.println();
		System.gc();
		try{	Thread.sleep(1000);	}
		catch(Exception e){	}
	}	
	Test09(){
		System.out.println("Test constructor "+ this);
	}
}

