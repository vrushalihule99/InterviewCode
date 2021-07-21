package com.amdocs.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class sortAndReverseSortArrayList {

	public static void main(String[] args) {

		ArrayList<String> arrList2 = new ArrayList<>();
		arrList2.add("sfsd");
		arrList2.add("aa");
		arrList2.add("jj");
		arrList2.add("fderfe");
		arrList2.add("dvd");
		
		Collections.sort(arrList2);
		System.out.println("Array list in ascending sort" +arrList2);
		Collections.sort(arrList2, Collections.reverseOrder());
		System.out.println("Array list in desceding sort" +arrList2);

	}

}
