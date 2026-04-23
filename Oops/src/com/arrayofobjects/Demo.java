package com.arrayofobjects;


class Circles {

	
		void m1() {
			System.out.println("m1");
		}
		
	

}
public class Demo {
	public static void main(String []  args) {
		Circles[] c=new Circles[5];
		c[0]=new Circles();
		c[1]=new Circles();
		c[2]=new Circles();
		c[3]=new Circles();
		c[4]=new Circles();
		for(Circles temp:c) {
			temp.m1();
		}
	}
}
