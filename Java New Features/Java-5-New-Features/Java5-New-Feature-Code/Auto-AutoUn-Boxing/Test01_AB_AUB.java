class Test01AutoboxingAngAutoUnboxing {
	public static void main(String[] args){
		// 1. PV >>>> WCO  [50 --> Integer(50) ]

		int i1 = 50;	//primitive value

		Integer io1 = new Integer(50);	//primitive value as an object
		Integer io2 = Integer.valueOf(50); // primitive value as an object

		Long lo1 = new Long(50);	
		Long lo2 = Long.valueOf(50);

		// 2. WCO >>>> PV  [ Integer(50) --> 50 ]

		Integer io3 = Integer.valueOf(50);	//primitive value as  an object 
		int i3 = io3.intValue();		// Object as a primitive value

		Long lo3 = Long.valueOf(50);
		long l3 = lo3.longValue();

		// 3. PSO >>>> WCO  [ "50" --> Integer(50) ]
		
		Integer io4 = Integer.valueOf("50");
		Integer io5 = new Integer("50");

		int i4 = io4.intValue();
		int i5 = io5.intValue();

		Long lo4 = new Long("19394902094");
		Long lo5 = Long.valueOf("193949020945");

		long l4 = lo4.longValue();
		long l5 = lo5.longValue();

		// 4. PSO >>>> PV  [ "50" --> 50 ]
		
		int i6 = Integer.parseInt("50");
		long l6 = Long.parseLong("193949020945");

		// 5. WCO >>>> PSO  [Integer(50) --> "50" ]

		Integer io7 = Integer.valueOf(50);
		String s1 = io7.toString();

		Long lo7 = Long.valueOf(9379403840L);
		String s2 = lo7.toString();

		// 6. PV >>>> PSO  [ 50 --> "50" ]
		String s3 = Integer.toString(50);
		String s4 = Long.toString(9379403840L);
	}
}