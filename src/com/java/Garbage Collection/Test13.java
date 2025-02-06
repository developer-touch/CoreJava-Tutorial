class Test13 {
	static void m1(Example e1){
		e1 = null;
	}
	public static void main(String[] args) {
		
		Example e1  = new Example();
		m1(e1);
	

		System.out.println();
		System.gc();
		try{	Thread.sleep(1000);	}
		catch(Exception e){	}
	}
}
