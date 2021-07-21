package com.amdocs.modifiers;

public class testStatic {

	static String name = "Vrushali"; //static variable
	static int age = 27; //static variable
	
	static {
		System.out.println("Inside static block");
		name = name+"Hule";
	}
	public static void incrementAge() { //static method
		
		age = age+1;
	}

	public static void main(String[] args) {
		
		//**************static methods and variables cannot be accessed from non-static methods***************
		incrementAge(); //static method accessed from static main method without creating object
		System.out.println(age); //static variables accessed without creating object
		System.out.println(name); //static variables accessed without creating object
	}
}
