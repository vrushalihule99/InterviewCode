package com.amdocs.comparableComparator;

public class student{

	 int id;
	 String name;
	 String address;
	
	 public student(int id, String name, String address){
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	 

}
