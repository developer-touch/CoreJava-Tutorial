class Test12 {
	public static void main(String[] args) {
	
		int[] ia = new int[5];
		ia[0] = 5;
		ia[1] = 6;
		ia[2] = 7;
		ia = null;

	//=======================================
		Example[] ea = new Example[5];
		ea[0] = new Example();
		ea[1] = new Example();
		ea[2] = new Example();
		
		Example e = ea[1];
		ea = null;
		
		System.gc();
		try{	Thread.sleep(1000);	}
		catch(Exception ex){	}

	//========================================
		String[] sa = new String[5];
		sa[0] = "a";
		sa[1] = new String("b");
		sa[2] = "a"+"b";
		sa[3] = "a".concat("b"); 
		sa[4] = "a".toLowerCase(); 
		
		sa = null;

	//========================================
		Integer[] ia1 = new Integer[5];
		ia1[0] = 50;
		ia1[1] = new Integer(70);
		ia1[2] = 190;
		ia1[3] = new Integer(250); 
		
		ia1 = null;

	}
}
