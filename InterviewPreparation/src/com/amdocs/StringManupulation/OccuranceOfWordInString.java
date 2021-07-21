package com.amdocs.StringManupulation;

import java.util.HashMap;

public class OccuranceOfWordInString {

	public static void main(String[] args) {
		
		String str = "madamsirmadamsir";
		char[] strArray = str.toCharArray();
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		
		for(int i=0 ; i<strArray.length ; i++) {
			
			if(hashmap.containsKey(strArray[i])) {
				//System.out.println(hashmap.get(strArray[i])+1);
			hashmap.put(strArray[i], hashmap.get(strArray[i])+1);
			}
		
		else
			hashmap.put(strArray[i], 1);
		}
		System.out.println(hashmap);
	}

}
