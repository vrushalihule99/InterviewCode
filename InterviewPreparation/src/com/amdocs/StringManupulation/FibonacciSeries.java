package com.amdocs.StringManupulation;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int length = 10;
		int num1 = 0;
		int num2 = 1;
		int counter = 0;
		
		while(counter<length) {
			
			System.out.println(num1+ " ");
			int num3 = num1+num2;
			num1 =num2;
			num2 = num3;
			counter++;
		}
		
	}
}
