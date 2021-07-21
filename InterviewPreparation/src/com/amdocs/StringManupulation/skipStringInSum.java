package com.amdocs.StringManupulation;

public class skipStringInSum {

	public static void main(String[] args) {
		
		int[] arr = {1,6,5,4,3,2,9,5};
		int sum =0;			
		for(int i=0 ; i<arr.length ; i++) {
			
			if(arr[i] != 6) {			
				sum = sum + arr[i];		
			}
			else
			{
				i = i + 5;
			}
		}
		System.out.println(sum);
	}		
}
