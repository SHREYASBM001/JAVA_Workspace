package com.interfaces;
interface I{
	void m1();
}
interface J {
	void m1();
}
class K implements I,J{
	public void m1() {
		System.out.println("m1 impl in K");
	}
}
public class Test4 {

	public static void main(String[] args) {
		I i=new K();
		i.m1();

	}

}
