class Test04{
	public static void main(String[] args) {
		Example e1 = new Example();

		for(int i=1; i<=2; i++) {
			Example e2 = new Example();
		}

		Example e3  ;
		for(int i=1; i<=2; i++) {
			e3 = new Example();
		}
		//System.out.println(e3);
		
		Example e4 = null;
		for(int i=1; i<=2; i++){
			e4 = new Example();
		}
		System.out.println(e4);
/**/
		System.out.println();
		System.gc();
		try{Thread.sleep(500);	}
		catch(Exception e){	}
	}
}