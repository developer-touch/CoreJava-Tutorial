class Example{
	{
		System.out.println("NSB");
		Example e = new Example();
	}
	Example(){
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		System.out.println("main");
		Example e1 = new Example();
	}
}
