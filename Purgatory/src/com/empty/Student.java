package com.empty;

import java.util.Comparator;

public class Student implements Comparable {
	String name;
	static int count=0;
	final int rollnum;
	String grade;
	@Override
	public int compareTo(Object o){
		Student s2=((Student)o);
		return name.compareTo(s2.name);
	}
	{
		
			rollnum=count;
			count++;
	
		
	}
	
	Student(String n,String c){
		name=n;
		grade=c;
	}
	
	public String toString() {
		return "Student[name:"+name+", RollNum:"+rollnum+", grade:"+grade+"]";
	}
	
}
