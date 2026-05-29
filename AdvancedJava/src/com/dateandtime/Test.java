package com.dateandtime;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		
		String s="1996-12-21";
		LocalDate ld1=LocalDate.parse(s);
		System.out.println(ld1);
		System.out.println(ld.getMonth());
		System.out.println(ld.getYear());
		System.out.println(ld.getDayOfWeek());
		
		System.out.println(ld.isLeapYear());
		System.out.println(ld1.isLeapYear());
		System.out.println(ld.plusYears(1));
		System.out.println(ld.plusDays(2).getDayOfWeek());
		System.out.println(ld.plusMonths(3).getMonthValue());
		

	}

}
