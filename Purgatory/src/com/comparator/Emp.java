package com.comparator;

public class Emp implements Comparable {
	String name;
	int sal;
	
	Emp(String n,int s){
		name=n;
		sal=s;
	}
	
	public int compareTo(Object o1) {
		Emp e1=(Emp)o1;
		return sal-e1.sal;
	}
	
	public String toString() {
		return "Emp["+name+","+sal+"]";
	}
}
