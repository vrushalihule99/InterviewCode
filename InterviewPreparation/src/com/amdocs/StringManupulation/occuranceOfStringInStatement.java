package com.amdocs.StringManupulation;

import java.util.HashMap;

public class occuranceOfStringInStatement {

	public static void main(String[] args) {
		
		String str = "Go corona go";
		String[] words = str.split(" ");
		
		for(int i=0 ; i< words.length ;i++) {
			
			words[i] = words[i].toString().toLowerCase();
		}
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(String word : words) {
			
			if(hm.containsKey(word)) {

			hm.put(word, hm.get(word)+1);
			
			}
			else
			hm.put(word, 1);	
		}
		
		System.out.println(hm);
	}
}
