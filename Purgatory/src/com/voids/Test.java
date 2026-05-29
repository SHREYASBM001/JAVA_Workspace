package com.voids;
class AA {
	void m1() {
		System.out.println("M1 from A");
	}
}
class BB extends AA {
//	@Override
//	void m1() {
//		System.out.println("M1 from B");
//	}
	void m2() {
		System.out.println("M2 from B");
	}
}
public class Test {
	public static void main(String[] args) {
		AA a =new AA();
		a.m1();
		AA a1=new BB();
		a1.m1();
		((BB)(a1)).m2();
		
	}
}
