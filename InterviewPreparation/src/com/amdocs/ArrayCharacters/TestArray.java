package com.amdocs.ArrayCharacters;

import java.util.Arrays;
import java.util.List;

public class TestArray {

	public static void main(String args[]) {
		
		Integer arr[] = {1,2,3,4,5,6};
		
		List<Integer> arrList = Arrays.asList(arr);
		System.out.println(arrList.toString());
		
		Integer[] arr2 = Arrays.copyOf(arr, 6); //(arr, 8)-> creates array of size 8  7th and 8th element as null
		System.out.println(Arrays.toString(arr2));
	
		System.out.println(Arrays.equals(arr, arr2));
		
		int intArr[] = {10,20,15,22,35};
		int intKey = 22;
		System.out.println(Arrays.binarySearch(intArr, intKey));
		
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
	}
}
