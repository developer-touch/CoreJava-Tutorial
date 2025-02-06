class Test01 
{
	public static void main(String[] args) 
	{
		Example e1 = new Example();	//not egc

		new Example();	//egc

		e1 = null;		//both reference egc

		System.gc();	//gc calling method for requesting JVM to run gc

		System.out.println();
	
		try{Thread.sleep(100);} //for pausing main method execution to allow gc to run 
		catch(InterruptedException e){}
	}
}
