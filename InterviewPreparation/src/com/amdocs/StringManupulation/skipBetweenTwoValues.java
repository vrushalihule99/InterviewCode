package com.amdocs.StringManupulation;

public class skipBetweenTwoValues {

	public static void main(String[] args) {
		
		int arr[] = {2,4,6,3,1,7,9,1,2};
		int start = 6;
		int end = 9;
		
		boolean add = true;
		int sum = 0;
		
		for( int i=0 ; i<arr.length ;i++) {
			
			if(arr[i] != start && add == true) {
				
				sum = sum +arr[i];
			}
			else if(arr[i]==start) {
				add = false;
			}
			else if (arr[i]==end) {
				add = true;
			}
			
		}
		System.out.println(sum);
		
	}

}
