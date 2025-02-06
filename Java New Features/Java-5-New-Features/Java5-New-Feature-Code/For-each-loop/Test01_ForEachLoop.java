import java.util.ArrayList;

class Test01_ForEachLoop {
	public static void main(String[] args){
		int[] ia = {10,20,30,40,50};
		
		//1:: Static nature code
		System.out.println(ia[0]);
		System.out.println(ia[1]);
		System.out.println(ia[2]);
		System.out.println(ia[3]);
		System.out.println(ia[4]);
		//System.out.println(ia[5]); //AIOOBE
		System.out.println();

		//2:: Only Value 
		for(int indexValue=0; indexValue<ia.length; indexValue++){
			int value = ia[indexValue];
			System.out.println(value);
		}
		System.out.println();

		//3:: Java 5V enhanced for loop (or) for each loop
		for(int value : ia){
			System.out.println(value);
		}
		System.out.println();

		//Limitation of for-each-loop, 
		//It can be used only for retrieving, If we want to iterate the loop for
		/*
		 * 1. Retrieving then
		 * 2. Replacing
		 * We must use old for loop with index
		 */

		 // Increase all values 'in the array' by 10 
		 // uodating array element by using  regular for loop
		 for(int i = 0; i<ia.length; i++){
			int value = ia[i];
			ia[i] = value+10;
		 }

		 // Retrieving and printing by using for-each loop
		 for(int values : ia){
			System.out.println(values+" ");
		 }
		System.out.println();
		 //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		 //Basically for-each loop given for simplifying collection programming for retrieving elements
		 //from the collection wirh less code

		 ArrayList<Integer> integerList = new ArrayList<Integer>();
		 integerList.add(1);
		 integerList.add(2);
		 integerList.add(3);
		 integerList.add(4);
		 integerList.add(5);
		 integerList.add(6);

		 //before java 5v 
		 for(int i=0; i<integerList.size(); i++){
			System.out.print(integerList.get(i)+" ");
		 }
		 System.out.println();

		 //From java 5v onwards
		 for(int values : integerList) {
			System.out.print(values+" ");
		 }
	}
}