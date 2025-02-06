class  A
{
	int x = 10;
}
class B extends A
{
	int y = 20;
}

class C extends B
{
	int z = 20;
}

class Test
{
	public static void main(String[] args){
		A a1 = new B();

		//B b1 = (B)a1;
		
		C c1 = (C)a1;

		A a2 = new B();

		System.out.println(a2.x);	
	
		System.out.println(a2.y):
	}
}