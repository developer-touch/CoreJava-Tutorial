class Example{
	static int count;
	public static void main(String[] args) {
		System.out.println("main start");
		Example e = new Example();
		System.out.println("Object Created");
		System.out.println("main end");
	}
	int x = m2();
	int m2() {
		System.out.println("NSV x");
		System.out.println("m2 end");
		return 10;
	}
	{
		System.out.println("NSB start");
		System.out.println("end of NSB");
	}
	Example(){
		System.out.println("constructor start"+ count++);
		Example e1 = new Example();
		System.out.println("end of constructor");
	}
}