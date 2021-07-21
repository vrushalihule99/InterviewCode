package com.amdocs.interfacesAndAbstractClass;

public abstract class TestAbstract {

	int i = 10;
	public abstract void m1();
	
	private void m2() {
		System.out.println("In method m2");
	}
	
	static void m3() {
		System.out.println("In method m3");
	}
	
	final void m4() {
		System.out.print("In method m4");
	}
	
	public static void main(String args[]) {
		
		//TestAbstract testAbstract = new TestAbstract(); //compile error
		
	}
}
