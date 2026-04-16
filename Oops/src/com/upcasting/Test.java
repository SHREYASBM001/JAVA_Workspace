package com.upcasting;
class A{
	void m1() {
		System.out.println("M1 in A");
	}
}
class B extends A{
	void m2() {
		System.out.println("M2 in B");
	}
}
class C extends B {
	void m3() {
		System.out.println("M3 in C");
	}
}
public class Test {
public static void main(String [] args) {
	A a1=new C(); //Upcasting syntax: (SuperClass) ref=(SuperClass)new (Subclass)
	a1.m1();
	C c1=new C();
	c1.m1();
	c1.m2();
	c1.m3();
	// a1.m2(); method m2 is undefined for type 'A' .but defined in 'B' and for  'C' through inheritance
	// a1.m3(); method m3 is undefined for type 'A' .but defined in 'C'
	/* can't access properties specific to subclass using superclass type objects/reference..
	*/
}
}
