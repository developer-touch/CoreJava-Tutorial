class Example
{
	static int count = 0;

	static void m1(){
		System.out.println("m1"+count++);	

		if(count==100)
			m1();
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		m1();
	}
}
