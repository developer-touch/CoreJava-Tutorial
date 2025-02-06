class Test10 {
	Example e;
	void m1(){
		e = new Example();
	}
	void m2(){ 
		Example e = new Example();
	}
	public static void main(String[] args) {
		Test10 t1 = new Test10();	t1.m1();		
		Test10 t2 = new Test10();	t2.m1();		
		Test10 t3 = new Test10();	t3.m1();		
		t1 = null;
	
		System.out.println();
		System.gc();
		try{	Thread.sleep(1000);	}
		catch(Exception e){	}
	}
	Test10(){
		System.out.println("Test constructor "+ this);
	}
	@Override
	protected void finalize(){
		System.out.println("Test finalize "+ this);
	}
}