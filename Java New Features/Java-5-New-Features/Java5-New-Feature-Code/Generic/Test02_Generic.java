import java.util.ArrayList;

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

class Test02_Generic {
	public static void main(String[] args){
		// java 1.4v code 
		ArrayList arrayList = new ArrayList();		// no generic, this collection heterogeneous collection, because here compiler does not specify type
		arrayList.add(5);
		arrayList.add(5.0);
		arrayList.add('a');
		arrayList.add(new Student());
		arrayList.add(new Sample());
		arrayList.add(new Example());
		System.out.print("Element :: "+arrayList);
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		Object object; 
		Integer integer;
		int i;

		object = arrayList.get(0);
		integer = (Integer) object;
		i = integer;
		System.out.println("Element :: "+i);

		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		// java 1.5v code
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(4);
		integerList.add(5);
		//integerList.add('a');	-> I C T 
		System.out.print("Element :: "+integerList);
		System.out.println();

		System.out.println("Element :: "+integerList.get(1));
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		ArrayList<Example> exampleList = new ArrayList<Example>();
		exampleList.add(new Example());
		exampleList.add(new Example());
		//exampleList.add(6);		-> I C T
		System.out.print("Element :: "+integerList);
		System.out.println();

		System.out.println("Element :: "+exampleList.get(1));
	}
}