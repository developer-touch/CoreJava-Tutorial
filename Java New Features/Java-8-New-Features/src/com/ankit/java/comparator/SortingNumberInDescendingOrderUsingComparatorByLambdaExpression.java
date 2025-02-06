package com.ankit.java.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortingNumberInDescendingOrderUsingComparatorByLambdaExpression {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(12);
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(25);
		arrayList.add(15);
		arrayList.add(18);
		arrayList.add(5);
		arrayList.add(4);
		System.out.println("Before sorting :: " + arrayList);
		Collections.sort(arrayList, (firstNumber, secondNumber) -> (firstNumber > secondNumber) ? -1 : 1);
		System.out.println("After sorting :: " + arrayList);
	}
}
