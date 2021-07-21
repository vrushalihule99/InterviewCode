package com.amdocs.StringManupulation;

import java.util.ArrayList;

public class FindAllSubStrings {

	public static void main(String[] args) {
		
		String str = "abcdabccabd";
		String subStr = "ab";
		String[] atrArray = str.split("ab");
		int len = str.length();
		int len2 = subStr.length();
		ArrayList<String> arrList = new ArrayList<String>();
		
		for(int i=0; i< len; i++) {
			for(int j=i+1 ;j<=len; j++) {
				
				arrList.add(str.substring(i,j));
			}
		}
		System.out.println(arrList);
		int counter=0;
		for(String s: arrList) {
			
			if(s.length()>=subStr.length()) {
				 if(s.equals(subStr)) { //use equals to find the strings having substring in it
					 counter++;
					 System.out.println("Present");
				 }
				 else
					 System.out.println("Not Present");
			}
		}
		System.out.println("Total occurance of substring "+ counter);
	}

}
