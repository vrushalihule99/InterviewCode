package com.amdocs.StringManupulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class nonDuplicateElements {

	public static void main(String[] args) {

		String str = "Go corona live go corona everyday";
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
		
		Set<Entry<String,Integer>> set = hm.entrySet();
		ArrayList<String> nonDuplicateList = new ArrayList<String>();
		
		for(Entry entry : set) {
			
			if(entry.getValue().equals(1)) {
				nonDuplicateList.add(entry.getKey().toString());
			}
		}
		System.out.println(nonDuplicateList);
	}

}
