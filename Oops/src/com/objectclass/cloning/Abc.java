package com.objectclass.cloning;

public class Abc extends Object implements Cloneable {
	int i;
	int j;
	Abc(Abc a){
		this.i=a.i;
		this.j=a.j;
	}
	Abc(){
		
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Abc a1=new Abc();
		a1.i=5;
		a1.j=6;
		
		Abc a2=a1; //reference copy
		
		Abc a3=new Abc();//deep copy example below
		a3.i=a1.i;//deep copy
		a3.j=a1.j;//deep copy
		
		//copying using copy constructor below
		Abc a4=new Abc(a1);
		
		//copying object using cloning below
		Abc a5=(Abc)a1.clone();
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
	}
	@Override
	public String toString() {
		return i+" and "+j;
	}
	@Override //changes access level from protected to public so every subclass or classes can use this
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

}
