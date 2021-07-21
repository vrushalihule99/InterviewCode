package com.amdocs.comparableComparator;

public class employee implements Comparable<employee>{

	private int id;
	private String name;
	private String address;
	
	employee(int id, String name, String address){
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public int compareTo(employee e) {
		return this.name.compareTo(e.name);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
