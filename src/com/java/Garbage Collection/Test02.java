class Test02 
{
	public static void main(String[] args) 
	{
		Example e1 = new Example();	//not egc
		Example e2 = new Example();
		Example e3 = new Example();
		Example e4 = e3;

		e3 = new Example();

		e2 = e1;

		e1 = null;
		System.gc();	//gc calling method for requesting JVM to run gc

		System.out.println();
	
		try{Thread.sleep(100);} //for pausing main method execution to allow gc to run 
		catch(InterruptedException e){}
	}
}