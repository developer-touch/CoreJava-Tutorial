class Example 
{
	static int count;

	void m1(){
		System.out.println("m1 start"+count++);
		m1();
		System.out.println("m1 end");
	}

	public static void main(String[] args) 
	{
		System.out.println("main start");
		Example e = new Example();
		System.out.println("Objrct Created");
		e.m1();
		System.out.println("main end");
	}
	int x = 2;

	int m2(){
		System.out.println("NSV x");
		return 10;
	}
	Example (){
		System.out.println("constructor");
		System.out.println("end of constructor");
	}
}
