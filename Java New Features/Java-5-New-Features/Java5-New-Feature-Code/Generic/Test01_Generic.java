class Student {

}
class Example {
	void m1(Object object) {
		System.out.println(object.getClass().getSimpleName()+" type of object is passed");
	}
}

class Sample<T> {		// generic class
	void m1(T t){
		System.out.println(t.getClass().getSimpleName()+" type of object is passed");
	}

	static<T> void m2(T t){
		System.out.println(t.getClass().getSimpleName()+" type of object is passed");
	}
}

class Test01_Generic {
	public static void main(String[] main){
		Example example = new Example();
		example.m1(5);
		example.m1(5.5);
		example.m1(55L);
		example.m1(new Sample());
		example.m1(new Student());
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		Sample<Integer> sample1 = new Sample();
		sample1.m1(5);
		//sample1.m1(5.5); -> incompatible types: double cannot be converted to Integer
		//sample1.m1('a');	-> incompatible types: char cannot be converted to Integer

		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		Sample<Double> sample2 = new Sample();
		sample2.m1(5.5);
		//sample2.m1(5);	-> incompatible types: int cannot be converted to Double
		//sample2.m1('a'); -> incompatible types: char cannot be converted to Double

		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		sample2.m2(50.5);	// T -> Double
		sample2.m2("hari");	// T -> String
	}
}