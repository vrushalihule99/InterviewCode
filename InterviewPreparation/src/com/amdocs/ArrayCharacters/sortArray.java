package com.amdocs.ArrayCharacters;

public class sortArray {

	public static void main(String[] args) {

		int[] arr = {3,6,1,8,7,2,5,4};
		
		for(int i=0 ; i<arr.length-1 ; i++) {
		
			if(arr[i]>arr[i+1]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				i = -1;
				}
			}	
		
		for( int j=0 ;j< arr.length ; j++) {
			System.out.println(arr[j]+ "");
		}
	}	
}
