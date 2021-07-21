package com.amdocs.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Vrushali");
		ll.add("Nitin");
		ll.add("Chirag");
		ll.add("Suhit");
		ll.add("Neha");
		
		Iterator itr = ll.descendingIterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
				
	}

}
