package com.ankit.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingNumberInAscendingOrderUsingComparator {
	public static void main(String[] args) {
		System.out.println("SortingNumberInAscendingOrderUsingComparator.main()::main started");
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(10);
		numberList.add(30);
		numberList.add(15);
		numberList.add(50);
		numberList.add(35);
		numberList.add(25);
		numberList.add(20);
		numberList.add(40);
		numberList.add(45);
		System.out.println("Before Sorting ::" + numberList);
		Collections.sort(numberList, new NumberCompartor());
		System.out.println("After Sorting :: " + numberList);
		System.out.println("SortingNumberInAscendingOrderUsingComparator.main()::main ended");
	}
}

class NumberCompartor implements Comparator<Integer> {

	@Override
	public int compare(Integer firstNumber, Integer secondNumber) {
		if (firstNumber > secondNumber) {
			return 1;
		} else if (firstNumber < secondNumber) {
			return -1;
		} else {
			return 0;
		}
	}

}
