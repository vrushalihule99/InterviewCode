package com.amdocs.Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class collection {

	@SuppressWarnings("rawtypes")
	public static void main(String args[]) {
		
		String[] arr = {"ABC", "DEF", "GHI","KLM", "OPQ"};
		String[] arr2 = {"123", "354", "456", "987", "120"};
		
		Collection collection = Arrays.asList(arr);
		
		List<String> arrList = Arrays.asList(arr2);
		
		//Way-1
		Iterator itr = collection.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		
		//Way-2
		Iterator itr2 = arrList.iterator();
		while(itr2.hasNext()) {
		System.out.println(itr2.next());
		}
	}
}
