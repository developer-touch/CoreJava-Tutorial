public class A {
	public static void m1(){
		System.out.println("A.m1()");
	}      
}

class Test{
	public static void main(String[] args) {
		System.out.println("Hello World!");
		A.m1();
	}
}
