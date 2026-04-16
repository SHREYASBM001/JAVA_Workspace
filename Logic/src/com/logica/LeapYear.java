package com.logica;

public class LeapYear {

	public static void main(String[] args) {
		int y=1995;
		if((y%400==0) || (y%4==0 && y%100!=0)) {
			System.out.println(y+" :is a Leap Year");
		}
		else {
			System.out.println(y+" :is not a leap year");
		}

	}

}
