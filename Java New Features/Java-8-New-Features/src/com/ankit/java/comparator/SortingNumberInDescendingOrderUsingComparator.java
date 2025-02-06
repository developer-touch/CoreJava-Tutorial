package com.ankit.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingNumberInDescendingOrderUsingComparator {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(2);
		al.add(7);
		al.add(5);
		al.add(8);
		System.out.println("Before sorting :: " + al);
		Collections.sort(al, new NumberComparator());
		System.out.println("After sorting :: " + al);
	}
}

class NumberComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer firstNumber, Integer secondNumber) {
		System.out.println("NumberComparator.compare()::compare started");
		if (firstNumber > secondNumber) {
			return -1;
		} else if (firstNumber < secondNumber) {
			return 1;
		} else {
			return 0;
		}
	}

}
