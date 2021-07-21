package com.amdocs.StringManupulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class findSmallestAndBiggestWordPalindrome {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		String str = "wow madam is driving racecar";
		String[] strArray = str.split(" ");
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		String smallest;
		String largest;
		
		//System.out.println(strArray.toString());
		for(int i=0 ;i<strArray.length ;i++) {
			
			StringBuilder strBuilder = new StringBuilder(strArray[i].toString());
				//System.out.println(strBuilder);
			if(strArray[i].toString().equals(strBuilder.reverse().toString())) {
				
				hm.put(strArray[i], strArray[i].length());				
			}
		}
		
		ArrayList<Integer> listValues = new ArrayList<Integer>(hm.values());
		
		Collections.sort(listValues);
		
		Set<Entry<String, Integer>> entries = hm.entrySet();
		for(Entry entry : entries) {
			
			if(entry.getValue().equals(listValues.get(0))) {
				
				smallest = (String) entry.getKey();
				System.out.println(smallest);
				
			}
			else if(entry.getValue().equals(listValues.get(listValues.size()-1))) {
				largest = (String) entry.getKey();
				System.out.println(largest);
			}
		}
	}	

}
