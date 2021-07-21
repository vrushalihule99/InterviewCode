package com.amdocs.comparableComparator;

import java.util.ArrayList;
import java.util.Collections;

public class comparatorStudent {

	public static void main(String[] args) {

		student s1 = new student(12, "Nitin" , "Pune");
		student s2 = new student(11, "Alok", "Mumbai");
		student s3 = new student(13, "Arun", "Mumbai");
		student s4 = new student(10, "Alok", "Ahmedabad");
		student s5 = new student(11, "Akash", "Bangalore");
		
		ArrayList<student> arrList = new ArrayList<>();
		arrList.add(s1);
		arrList.add(s2);
		arrList.add(s3);
		arrList.add(s4);
		arrList.add(s5);
		
		Collections.sort(arrList, new sortStudentByName());
		
		System.out.println(arrList);
	}
	
}
