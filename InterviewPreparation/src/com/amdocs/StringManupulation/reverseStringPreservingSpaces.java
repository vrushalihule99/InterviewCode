package com.amdocs.StringManupulation;

public class reverseStringPreservingSpaces {

	public static void main(String args[]) {
	String str = " I am software engineer";
	String[] strArray = str.split(" ");
	
	StringBuffer strBuffer = new StringBuffer(str);
	strBuffer.reverse();
	
	for(int i=0; i<str.length() ; i++) {
		 if(str.charAt(i)== ' '){
			 strBuffer.insert(i, " ");
	      }		
	}
	
	strBuffer.append("");
	System.out.println(strBuffer);
	}
}
