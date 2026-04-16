package com.factorymeth;
class A {
	static A a;
	 private A() {
		
	}
	public static A get() {
		if(a==null) {
			a=new A();
			return a;
		}
		else return a;
	}
}
public class Test {

	public static void main(String[] args) {
		A a1=A.get();
		A a2=A.get();
		A a3=A.get();
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

	}

}
