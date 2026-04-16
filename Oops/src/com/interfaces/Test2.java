package com.interfaces;
interface X {
	void m1();
}
class Y implements X {
	public void m1() {
		System.out.println("M1 impl in Y");
	}
}
class Z implements X{
	public void m1() {
		System.out.println("M1 impl in Z");
	}
}
public class Test2 {

	public static void main(String[] args) {
	X x=new Y();
	x.m1();
	x=new Z();
	x.m1();

	}

}
