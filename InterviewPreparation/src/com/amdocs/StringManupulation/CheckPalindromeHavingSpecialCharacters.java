package com.amdocs.StringManupulation;

import java.util.ArrayList;

public class CheckPalindromeHavingSpecialCharacters {

	public static void main(String[] args) {
		
		String str = "Ma5$d*am";
		char[] strArray = str.toCharArray();
		ArrayList<Character> arrList = new ArrayList<Character>();
		for(int i=0 ; i<strArray.length ; i++) {
			
			char c = str.charAt(i);
			if(c>='a' && c<='z' || c>='A' && c<='Z') {
				
				
				arrList.add(c);
			}
		}
		System.out.println(arrList.toString());
	}	
}
