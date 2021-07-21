package com.amdocs.comparableComparator;

import java.util.Comparator;

public class sortStudentByName implements Comparator<student>{

	@Override
	public int compare(student s1, student s2) {

		return s1.name.compareTo(s2.name);
	}

}
