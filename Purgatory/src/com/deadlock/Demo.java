package com.deadlock;

class A {
	synchronized void m1(B b) {
		System.out.println("M1 starts");
		b.last();
		System.out.println("M1 ends");
	}
	synchronized void last() {
		System.out.println("last() of A");
	}
}
class B {
	synchronized void m2(A a) {
		System.out.println("M2 starts");
		a.last();
		System.out.println("M2 ends");
	}
	synchronized void last() {
		System.out.println("last() of B");
	}
}
class Test extends Thread {
	A a1=new A();
	B b1=new B();
	public void m1() {
		this.start();
		a1.m1(b1);
	}
	public void run() {
		b1.m2(a1);
	}
}
public class Demo {
	public static void main(String[] args) {
		Test t=new Test();
		t.m1();
	}
}
