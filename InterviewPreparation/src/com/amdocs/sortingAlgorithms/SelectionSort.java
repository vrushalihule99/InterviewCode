package com.amdocs.sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = {7,4,3,10,8,1};
		
		//System.out.println(arr.length);
		for(int i=0 ;i<arr.length-1 ; i++) {
			
			int min = i;
			
			for(int j=i+1 ;j<arr.length ;j++) {
				
				if(arr[j]< arr[min]) {
					min = j;
				}
			}
			if( min != i) {
			
				//swap arr[i] and min
				
				int temp;
				
				temp = arr[i];	
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
