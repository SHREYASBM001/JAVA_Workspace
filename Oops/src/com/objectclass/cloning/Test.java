package com.objectclass.cloning;
class B {
	int x;
	@Override
	public String toString() {
		return x+"";
	}
}
class A implements Cloneable {
	int i;
	B b;

	@Override
	public String toString() {
		return i+" and "+b;
	}
	@Override 
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class Test  {

	public static void main(String[] args) throws CloneNotSupportedException{
		A a=new A();
		a.i=10;
		a.b=new B();
		a.b.x=100;
		System.out.println(a);// 10 and 100
		
		A a2=(A)a.clone();
		
		System.out.println(a2); //10 and 100
		
		a2.b.x=1000;
		System.out.println(a); //not 10 and 100 :(
		System.out.println(a2); //10 and 1000
		


	}

}
