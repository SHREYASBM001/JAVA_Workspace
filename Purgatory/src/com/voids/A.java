package com.voids;

public class A  {
	int a;
	A(){
		System.out.println("A is created no args");
	}
	A(A a){
		System.out.println("A is created,with args");

	}
}
class B extends A{
	B(){
		System.out.println("B iS  created");
		new A(this);
	}
}
