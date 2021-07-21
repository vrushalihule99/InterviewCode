package com.amdocs.comparableComparator;

import java.util.ArrayList;
import java.util.Collections;

public class comparableEmployee {

	public static void main(String[] args) {

		employee e1 = new employee(12, "Nitin" , "Pune");
		employee e2 = new employee(11, "Alok", "Mumbai");
		employee e3 = new employee(13, "Arun", "Mumbai");
		employee e4 = new employee(10, "Alok", "Ahmedabad");
		employee e5 = new employee(11, "Akash", "Bangalore");
		
		ArrayList<employee> arrList = new ArrayList<>();
		arrList.add(e1);
		arrList.add(e2);
		arrList.add(e3);
		arrList.add(e4);
		arrList.add(e5);
		
		Collections.sort(arrList);
		System.out.println(arrList);
		for(employee arr : arrList) {
			
			System.out.println(arr.toString());
		}
		
	}

}
