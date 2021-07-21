package com.amdocs.StringManupulation;

import java.util.Arrays;

public class anagrams {
	
	public static void main(String args[]) {
		
		String str1 = "listin";
		String str2 = "silent";
		
		char str1Characters[] = str1.toCharArray();
		char str2Characters[] = str2.toCharArray();
		
		if(str1.length()==str2.length()) {
			
			Arrays.sort(str1Characters);
			Arrays.sort(str2Characters);	
			
			if(compareStrings(str1Characters, str2Characters)) {
				System.out.println("Anagrams");
			}
			
			else
				System.out.println("Not Anagrams");
			
		}
	}	
			
		public static boolean compareStrings(char[] str1Characters, char[] str2Characters) {
			for(int i=0 ; i<str1Characters.length ; i++) {
				if(str1Characters[i] != str2Characters[i]) {
					 return false;
					 
				}
			}
			return true;
		}	
}
