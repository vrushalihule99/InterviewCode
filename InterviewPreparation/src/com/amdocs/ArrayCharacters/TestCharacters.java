package com.amdocs.ArrayCharacters;

public class TestCharacters {

	public static void main(String[] args) {

		char[] charArr = {'A', 'N', 'J', 'P', 'S'};
		
		System.out.println(Character.compare('H', 'J')); //output -2
		System.out.println(Character.toLowerCase('J'));
		
		String s = "Hello World1!";
		char[] charArray = s.toCharArray();
		int count=0;
		for( int i=0 ; i< charArray.length ;i++) {
			if(Character.isWhitespace(i)) {
				count++;
			}
			if(Character.isAlphabetic(i)) {
				
			}
		}
		System.out.println("Total whitespaces in array= "+ count);
		
		
	}

}
