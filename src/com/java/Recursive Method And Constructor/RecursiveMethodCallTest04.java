class Example {
	static Example e1 = new Example();
	
	Example(){
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		System.out.println("main");
		Example e2 = new Example();
	}
}