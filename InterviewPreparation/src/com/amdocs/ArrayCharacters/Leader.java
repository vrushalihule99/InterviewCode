package com.amdocs.ArrayCharacters;

import java.util.ArrayList;
import java.util.Collections;

public class Leader {

	public static void main(String[] args) {

		int arr[] = { 16, 17, 4, 3, 5, 2};
		int len = arr.length;
		int n = 6;
		ArrayList<Integer> a = new ArrayList<Integer>();
		int leader = arr[n - 1];
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] >= leader) {
				leader = arr[i];

				a.add(arr[i]);
			}
		}
		Collections.reverse(a);

		System.out.println(a);
	}

}
