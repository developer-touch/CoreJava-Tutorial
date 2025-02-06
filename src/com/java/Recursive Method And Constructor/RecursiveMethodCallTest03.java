class Example{
	static {
		System.out.println("SB");
		Example e1 = new Example();
	}
	Example(){
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		Example e2 = new Example();
	}
}