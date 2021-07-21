package com.amdocs.StringManupulation;

import java.util.HashMap;
import java.util.Map;

public class deleteRepetatedWordsOfString {

	public static void main(String[] args) {
		
		String str = "Avalara";
		char[] strArray = str.toLowerCase().toCharArray();
		Character duplicateValue = null;

		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		
		for(int i=0 ; i<strArray.length ; i++) {
			
			if(hashmap.containsKey(strArray[i])) {
				
				duplicateValue = strArray[i];
				
				hashmap.put(strArray[i], hashmap.get(strArray[i])+1);
			
			}
		
		else
				hashmap.put(strArray[i], 1);
		}
		
		for(Map.Entry<Character, Integer> entries :hashmap.entrySet()) {
			
			Character key = entries.getKey();
			
			if(key.equals(duplicateValue)) {
				
				String newStr = str.replaceAll(key.toString(), "");
				System.out.println(newStr);
			}
			
		}
	}

}
