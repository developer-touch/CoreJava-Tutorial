class Example{
	int x = 5,y = 6;
	
	public static Example e1 = new Example();
	{
		System.out.println("Inittializer block");
		System.out.println(this.x);
		System.out.println(this.y);
	}
	public static void main(String[] args) {
		
	}
}