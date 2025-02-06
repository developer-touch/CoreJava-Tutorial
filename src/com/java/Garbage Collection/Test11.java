class Test11 {
	static Example e;
	void m1(){
		e = new Example();
	}
	void m2(){
		Example e = new Example();
	}
	public static void main(String[] args) {
		Test11 t1 = new Test11();	t1.m1();		
		t1 = null;

		System.out.println();
		System.gc();
		try{	Thread.sleep(1000);	}
		catch(Exception e){	}
	}
	Test11(){
		System.out.println("Test constructor "+ this);
	}
	@Override
	protected void finalize(){
		System.out.println("Test finalize "+ this);
	}
}