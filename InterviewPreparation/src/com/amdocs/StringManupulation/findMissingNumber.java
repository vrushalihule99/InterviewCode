package com.amdocs.StringManupulation;

public class findMissingNumber {

	public static void main(String[] args) {

		int arr[] = {11, 12, 13, 15, 16};
		try {
		for(int i=0 ; i<arr.length ; i++) {
			
			if((arr[i+1] - arr[i]) > 1){
				
				System.out.println("Missing number is "+(arr[i+1]-1));
				}
		else
			System.out.println("No number missing");
			}
		}	
		catch(Exception e) {}
	}
}
