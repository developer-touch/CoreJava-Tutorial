class Person{ }
class Student extends Person{}
class Faculty extends Person{}
class Admin { }

class Test02{
	public static void main(String[] args){
		Person p1 = new Person();
		System.out.println(p1.toString());

		Person p2 = new Student();
		System.out.println(p2.toString());

		Person p3 = new Faculty();
		System.out.println(p3.toString());

		//Person p4 = new Admin();
		//System.out.println(p4);

		//Student s1 = new Person();
		Student s2 = new Student();
		//Student s3 = new Faculty();
		//Student s4 = new Admin();

		allow(new Person());
		allow(new Student());
		allow(new Faculty());
		//allow(new Admin());
	}

	static void allow(Person p){
		
	}

	static Person get1(){
		return new Person();
	}

	static Person get2(){
		return new Student();
	}

	static Person get3(){
		return new Faculty();
	}

//	static Person get4(){
//		return new Admin();
//	}

	static Student get5(){
		return new Student();
	}
	
//	static Student get6(){
//		return new Person();
//	}
//
//	static Student get7(){
//		return new Faculty();
//	}

}

