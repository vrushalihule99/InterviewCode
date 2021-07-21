package com.amdocs.Collections;

import java.util.ArrayList;

public class UncommonElementdArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		ArrayList<Integer> arr3 = new ArrayList<>();
		
		arr1.add(6);
		arr1.add(7);
		arr1.add(2);
		arr1.add(8);
		
		arr2.add(1);
		arr2.add(2);
		arr2.add(3);
		arr2.add(4);
		
		arr3.addAll(arr1);
		//arr2.addAll(arr1);
		arr1.retainAll(arr2);
		arr3.removeAll(arr1);
		System.out.println("Non duplicates from list1" + arr3);
		
		arr2.removeAll(arr1);
		System.out.println("Non duplicates from list2"+arr2);
	}

}
