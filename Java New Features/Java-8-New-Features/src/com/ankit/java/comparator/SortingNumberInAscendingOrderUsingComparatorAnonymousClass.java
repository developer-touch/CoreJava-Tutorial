package com.ankit.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingNumberInAscendingOrderUsingComparatorAnonymousClass {
	public static void main(String[] args) {
		System.out.println("SortingNumberInAscendingOrderUsingComparatorAnonymousClass.main()::main started");
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(1);
		numberList.add(5);
		numberList.add(9);
		numberList.add(3);
		numberList.add(2);
		numberList.add(4);
		numberList.add(7);
		numberList.add(6);
		numberList.add(8);
		System.out.println("Before Sorting :: " + numberList);
		Collections.sort(numberList, new Comparator<Integer>() {

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

		});
		System.out.println("After Sorting :: " + numberList);
		System.out.println("SortingNumberInAscendingOrderUsingComparatorAnonymousClass.main()::main ended");
	}
}
