package com.empty;

import java.util.Arrays;

public class StudentDetails {

	public static void main(String[] args) {
	Student[] s=new Student[3];
	
	s[0]=new Student("Answer","Z");
	s[1]=new Student("Question","A");
	s[2]=new Student("Condition","B");
	System.out.println(Arrays.toString(s));
	Arrays.sort(s,new StudentGradeComp());
	System.out.println(Arrays.toString(s));
	
	/*

*
*/
	System.out.println(Arrays.toString(s));
	Arrays.sort(s);
	System.out.println(Arrays.toString(s));

	}

}
