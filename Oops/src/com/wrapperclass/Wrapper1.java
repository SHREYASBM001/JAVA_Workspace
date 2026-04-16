package com.wrapperclass;

public class Wrapper1 {
	//Byte,Short,Integer,Long,Float,Double,Character,Boolean are wrapper classes(Non Primitive Data Types)
	public static void main(String[] args) {
	int a=10;
	Integer b=a; //auto boxing(implicit)
	Integer c=Integer.valueOf(a); // boxing(explicit)
	int f=new Integer(20); //auto boxing(implicit)
	
	int d=b; //auto un-boxing(implicit)
	int e=c.intValue(); // un-boxing(explicit)
	
	
	System.out.println("Primitive int: "+a);
	System.out.println("Non Primitive(wrapper) int: "+b);
	System.out.println("Non Primitive(wrapper) int: "+c);
	System.out.println("Primitive int: "+d);
	System.out.println("Primitive int: "+e);
	System.out.println("Primitive int: "+f);
	
		
		
	}

}
