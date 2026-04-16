package com.interfaces;
interface A {
	int i=2;
	void m1();
	void m2();
	/*
	 * Now Subclasses has to implement both methods in the interface,or else error
	 */
}
class B implements A {
	public void m1() {
		System.out.println("M1 impl in B");
	}
	public void m2() {
		System.out.println("M2 impl in B");
	}
} 
class C implements A {
	public void m1() {
		System.out.println("M1 impl in C");
	}
	public void m2() {
		System.out.println("M2 impl in C");
	}
}
class General {
	void runGeneral(A a){
	a.m1();
	a.m2();
	}
}
public class Test {

	public static void main(String[] args) {
		General g=new General();
		g.runGeneral(new B());
		g.runGeneral(new C());
		
		A a=new B();
		a.m1();
		a.m2();
		
		a=new C();
		
		a.m1();
		a.m2();

	}

}
