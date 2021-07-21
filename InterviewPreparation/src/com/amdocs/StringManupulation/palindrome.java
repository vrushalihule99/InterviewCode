package com.amdocs.StringManupulation;

public class palindrome {

	public static void main(String[] args) {
		
		String str = "madam";
		
		StringBuilder strBuilder = new StringBuilder(str);
		StringBuilder revStr = strBuilder.reverse();
		
		if(strBuilder.equals(revStr)) {
			
			System.out.println("Given string is palindrome");	
		}
		
		else
			System.out.println("Given string is not palindrome");
	}
		
}
