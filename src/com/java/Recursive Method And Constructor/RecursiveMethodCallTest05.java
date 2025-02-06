class Example{
	static {
		System.out.println("SB start");
		Example e = new Example();
	}
	
	{
		System.out.println("NSB start");
		System.out.println("NSB end");
	}
	
	Example(){
		System.out.println("constructor");
		System.out.println("constructo end");
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println("main end");
	}
}