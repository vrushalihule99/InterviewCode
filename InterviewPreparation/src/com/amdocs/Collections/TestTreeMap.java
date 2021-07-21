package com.amdocs.Collections;

import java.util.HashMap;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Vrushali", 28);
		hashMap.put("Khushboo", 28);
		hashMap.put("Rushikesh", 18);
		hashMap.put("Nitin", 33);
		
		System.out.println(hashMap);
		
		TreeMap<String, Integer> treeMap = new TreeMap<>(hashMap);
		System.out.println(treeMap);
	}

}
