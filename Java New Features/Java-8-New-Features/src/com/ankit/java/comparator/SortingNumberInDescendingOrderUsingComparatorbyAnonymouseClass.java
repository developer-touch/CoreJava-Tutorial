package com.ankit.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingNumberInDescendingOrderUsingComparatorbyAnonymouseClass {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(10);
		al.add(20);
		al.add(25);
		al.add(5);
		al.add(15);
		al.add(11);
		System.out.println("Before Sorting :: " + al);
		
		Collections.sort(al, new Comparator<Integer>() {
			@Override
			public int compare(Integer firstNumber, Integer secondNumber) {
				if (firstNumber > secondNumber) {
					return -1;
				} else if (firstNumber < secondNumber) {
					return 1;
				} else {
					return 0;
				}
			}
		});
		System.out.println("After sorting :: "+al);
	}
}
