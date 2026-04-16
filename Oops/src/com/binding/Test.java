package com.binding;
class A {
	int i;
}
class B extends A {
	int i=20;
}
public class Test {

	public static void main(String[] args) {
		
		A a=new B();
		System.out.println(a.i);
	}

}
