package com.ankit.java.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortingNumberInAscendingOrderUsingComparatorLambdaExpression {
	public static void main(String[] args) {
		System.out.println("SortingNumberInAscendingOrderUsingComparatorLambdaExpression.main()::main started");
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(3);
		numberList.add(2);
		numberList.add(1);
		numberList.add(9);
		numberList.add(5);
		numberList.add(8);
		numberList.add(7);
		numberList.add(4);
		numberList.add(6);
		System.out.println("Before Sorting :: " + numberList);
		Collections.sort(numberList, (firstNumber, secondNumber) -> (firstNumber > secondNumber) ? 1 : -1);
		System.out.println("After Sorting :: " + numberList);
		System.out.println("SortingNumberInAscendingOrderUsingComparatorLambdaExpression.main()::main ended");
	}
}
