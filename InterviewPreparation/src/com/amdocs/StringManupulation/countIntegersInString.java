package com.amdocs.StringManupulation;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class countIntegersInString {

	public static void main(String[] args) {
		
		String str = "0Vrush999Hule1";
		ArrayList<Character> intArrayList = new ArrayList<Character>();
		char[] strArray = str.toCharArray();
		
		//String[] strArray1 = str.split("");
		for(int i=0 ; i <= strArray.length-1 ;i++) {
		if(Character.isDigit(strArray[i])) {
			
			//System.out.println(strArray[i]);
			intArrayList.add(strArray[i]);
		}
		
		}
		
		System.out.println(intArrayList);
	}

}
