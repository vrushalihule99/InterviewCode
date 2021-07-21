package com.amdocs.modifiers;

public class StaticCheck {
	
	public static void main(String[] args) {
		
		System.out.println(fun());

	}
	
	static int fun() {
		static int x =0; //static variables should always be initialised before static method is called
		return ++x;
	}

}
