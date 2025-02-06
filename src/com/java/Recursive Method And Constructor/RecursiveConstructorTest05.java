class Example{
	int x = m1();
	
	int m1() {
		System.out.println("NSV x");
		System.out.println("end m1");
		return 10;
	}
	
	{
		System.out.println("NsB start");
		Example e1 = new Example();
		System.out.println("NSV end");
	}
	
	Example(){
		System.out.println("constructor start");
		System.out.println("constructor end");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		Example e2 = new Example();
		System.out.println("main end");
	}
}