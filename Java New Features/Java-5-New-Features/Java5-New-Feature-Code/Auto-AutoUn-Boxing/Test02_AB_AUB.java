import java.util.ArrayList;

class Test02_AutoboxingAndAutoUnboxing {
	public static void main(String[] args){

		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		//like PDTs,their WCs are not compatible to each other 
		//WCs are sibling

		Integer io8 = new Integer(50);
		//Long lo9 = io8;	>>incompatible types: Integer cannot be converted to Long

		//we can't compare WCOs of different type, not compatiable 

		Integer io9 = new Integer(50);
		Long lo9 = new Long(50L);
		//System.out.println(io9==lo9);	>> incomparable types: Integer and Long
		System.out.println(io9.equals(lo9));	// false

		Integer io10 = new Integer(50);
		Integer io11 = new Integer(50);
		System.out.println(io10==io11);		// false [ different reference ]
		System.out.println(io10.equals(io11));	// true [ same state ]

		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		//Boxing  >>>> PV  to  WCO 
		Integer io12 = new Integer(50);

		//Unboxing  >>>> WCO  to PV
		int i12 = io12.intValue();

		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		//From java 5v onwards 
		//Auto Boxing  >>>> PV to WCO 
		Integer io13 = 50;		// Integer io13 = Integer.valueOf(50);

		//Auto Unboxing >>>> WCO to PV
		int i13 = io13;		// int i13 = io13.intValue();
		m1(50);				// AB :  m1(Integer.valueOf(50));

		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Why AB and AUB ?
		//Tumari Answer >>> for achieving 100% OOP
		
		int firstNumber = 10;
		int secondNumber = 20;
		int result1  = firstNumber + secondNumber;
		System.out.println("Result1 :: "+ result1);

		Integer thirdNumber = 10;		// AB		>>>> PV to WCO
		Integer fourthNumber = 20;	// AB		>>>> PV to WCO
		Integer result2 = thirdNumber + fourthNumber;	// AB(PV to WCO ) =  (AUB (WCO to PV)  + AUB (WCO to PV) ) 
		System.out.println("Result2 :: "+ result2);			//result2.toString()

		Integer fifthNumber = Integer.valueOf(50);
		Integer sixthNumber = Integer.valueOf(50);
		Integer result3 = Integer.valueOf(fifthNumber.intValue()+sixthNumber.intValue());
		System.out.println("Result3 :: "+ result3);			//resut3.toString()

		// No for achieving 100% OOP
		//It is given for making collection programming easy
		//java 1.4V on collection programming

		ArrayList arrayList1 = new ArrayList<>();
		arrayList1.add(new Integer(50));
		arrayList1.add(new Long(50L));
		arrayList1.add(new Double(50.50));
		arrayList1.add(new Character('a'));
		arrayList1.add(new Boolean(true));

		Object object = arrayList1.get(0);
		Integer integer = (Integer)object;
		int objectValue = integer.intValue();

		//java 5v collection programming simplified code
		ArrayList<Object> arrayList2 = new ArrayList<Object>();
		arrayList2.add(new Integer(50));
		arrayList2.add(new Long(50L));
		arrayList2.add(new Double(50.50));
		arrayList2.add(new Character('a'));
		arrayList2.add(new Boolean(true));
		
		arrayList2.forEach(element->System.out.println(element+" "));

		object = arrayList2.get(0);
		objectValue = (Integer)object;

		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		//Why valueOf(-) , Why not new Kw and constructor ?
		//=>For implementing 'object pooling' 

		Integer integer2 = 50;	// Integer integer2 = Integer.valueOf(50);
		Integer integer3 = 50;		// Integer integer3 = Integer.valueOf(50);
		System.out.println(integer2 == integer3);	// true [ same state ]

		// pooling is applied to only byte range value with the data type
		// Btye, Short, Long, Chararcter and boolean objects

		Integer integer4 = 127;
		Integer integer5  = 127;
		System.out.println(integer4==integer5);		//true [same state ]

		Integer integer6 = 128;
		Integer integer7 = 128;
		System.out.println(integer6==integer7);		// false [ outOf byte range ]
		
	}
	static void m1(Object object) {
		
	}
}