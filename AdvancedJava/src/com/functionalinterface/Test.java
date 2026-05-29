package com.functionalinterface;
interface Doable{
	void did(int a,int b);
}
public class Test {

	public static void main(String[] args) {
		int a=10;
		int b=10;
		Doable d=(e,f)->{
			System.out.println(a+b);
		};
		d.did(a, b);
	}

}
