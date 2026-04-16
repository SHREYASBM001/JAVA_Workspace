package com.upcasting;
abstract class G{
	 abstract void m1() {
		  System.out.println("hello");
	  }
		
	
}
class H extends G {
	void m1() {
		System.out.println("M1 in H");
	}
	void m2() {
		System.out.println("M2 in H");
	}
	
}

class I extends H{
	void m1() {
		System.out.println("M1 in I");
		System.out.println("M1 in I 2");
	}
	void m2() {
		System.out.println("M2 in I");
		System.out.println("M2 in I 2");
	}
}
public class Test3 {

	public static void main(String[] args) {
		
		
		
		// G g=new G(); can't create instances of abstract classes
		
		// g.m2(); only defined methods in super class can be used to call overridden method inside subclass by using 
		// superclass type variable..
		
		G g=new H();
		g.m1(); 
		
		
		g=new I();
		g.m1();
		
		// g.m2(); only defined methods in super class can be used to call overridden method inside subclass..
		
		
	}

}
