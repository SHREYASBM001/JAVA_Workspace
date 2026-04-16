package com.upcasting;
class D{
	void m1(){
		System.out.println("M1 in D");
	}
}
class E extends D {
	void m2() {
		System.out.println("M2 in E");
	}
}

class F extends E{
	void m3() {
		System.out.println("M3 in F");
	}
}
public class Test1 {

	public static void main(String[] args) {
		
		F f1=new F();
		E e1=f1;
		D d1=f1;
		
		f1.m1();
		f1.m2();
		f1.m3();
		
		e1.m1();
		e1.m2();
		//e1.m3();
		
		d1.m1();
		//d1.m2();
		//d1.m3();
		/* can't access properties specific to subclass using superclass type objects/reference..
		*/
	}

}
