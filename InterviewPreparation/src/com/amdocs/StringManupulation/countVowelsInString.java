package com.amdocs.StringManupulation;

public class countVowelsInString {

	public static void main(String[] args) {

		String str = "Block Statements";
		 int vowelCount = 0;
		for(int i=0 ; i<str.length() ; i++) {
			
			if(str.charAt(i)== 'a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				vowelCount++ ;
			}
		}
		
		System.out.println("Vowel count in string : "+vowelCount);

	}

}
