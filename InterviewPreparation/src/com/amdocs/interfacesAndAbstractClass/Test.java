package com.amdocs.interfacesAndAbstractClass;

public class Test extends TestAbstract{
	
	int i = 20;
	public static void main(String[] args) {
		
		TestAbstract testAbstract = new Test();
		testAbstract.m1();
		testAbstract.m3();
		testAbstract.m4();
		System.out.println(testAbstract.i);
		
		System.out.println();
		System.out.println("****************************************");
		System.out.println();
		
		Test test = new Test();
		test.m1();
		test.m3();
		test.m4();
		System.out.println();
		test.testM1();
		test.testM2();
		test.testM3();
		System.out.println(test.i);
		
	}

	@Override
	public void m1() {

		System.out.println("In method m1...");
	}
	
	public void testM1() {
		System.out.println(super.i);
		System.out.println("In test m1");
	}
	
	private void testM2() {
		System.out.println("In test m2");
	}
	
	static void testM3() {
		System.out.println("In test m3");
	}

}
