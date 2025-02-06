class Example{

	private int x;
	 Example() {
		x = 10;
		System.out.println("Ex constructor :: "+this);
	 }

	 @Override 
	 protected void finalize(){
		System.out.println("In finalize :: "+this);
	 }
}