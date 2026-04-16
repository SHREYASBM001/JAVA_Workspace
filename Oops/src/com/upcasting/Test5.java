package com.upcasting;
class J {
	void m1() {
	System.out.println("M1 in J");
	}
}
class K extends J {
	void m2() {
		System.out.println("M2 in K");
		}
}
class L extends J {
	void m3() {
		System.out.println("M3 in L");
		}
}
public class Test5 {

	public static void main(String[] args) {
	J j=new J();
	System.out.println(j instanceof K);
	j=new K();
	System.out.println(j instanceof J);
	System.out.println(j instanceof K);
	System.out.println(j instanceof L);
	System.out.println(j instanceof J);
	
	j.m1();
	// j.m2();
	K k=(K)j;
	System.out.println(j instanceof J);
	System.out.println(j instanceof K);
	System.out.println(j instanceof L);
	k.m2();
	j=new L(); 
	// j.m3();
	// k.m3();
	L l=(L)j;
	System.out.println(j instanceof J);
	System.out.println(j instanceof K);
	System.out.println(j instanceof L);
	l.m3();
	System.out.println(k instanceof J);
	System.out.println(l instanceof J);
	

	}

}
