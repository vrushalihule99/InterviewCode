package com.amdocs.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class NonRepetativeCharacters {

	public static void main(String[] args) {

		String str = "geeksforgeeks";
		char[] strArray = str.toCharArray();
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		//first for loop to store repeating and non repeating characters
		for (int i = 0; i < strArray.length; i++) {
			if (hmap.containsKey(strArray[i])) {
				hmap.put(strArray[i], hmap.get(strArray[i]) + 1);
			} else
				hmap.put(strArray[i], 1);
		}
		
		//second for loop to identify first non repeating character
		for(int i=0; i<str.length();i++) {
			char c = str.charAt(i);
			System.out.println(hmap.get(c));
			if(hmap.get(c) == 1) {
				System.out.println("First non repeating character is "+ c);
				break;
			}
		
		}
	}	
}
