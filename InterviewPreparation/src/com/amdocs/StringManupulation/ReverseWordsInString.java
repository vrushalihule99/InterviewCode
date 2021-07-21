package com.amdocs.StringManupulation;

import java.util.Arrays;

public class ReverseWordsInString {

	public static void main(String[] args) {
		
		String str = "i.like.this.program.very.much";
		
		String[] strArray = str.split("\\.");
		
		int length = strArray.length-1;
		for( int i=0; i<=length/2 ;i++) {
			
			String temp;
			temp = strArray[length-i];
			strArray[length-i] = strArray[i];
			strArray[i] = temp;			
		}
		
		System.out.println(Arrays.toString(strArray));
	}

}
