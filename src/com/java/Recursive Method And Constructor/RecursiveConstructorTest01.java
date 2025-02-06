class Example
{
	static int count;

	Example(){
		System.out.println("Constructor"+ count++);
		if(count==50)
			
		Example e1 = new Example();
	}
	public static void main(String[] args) {
		System.out.println("main");
		Example e1 = new Example();
	}
}
