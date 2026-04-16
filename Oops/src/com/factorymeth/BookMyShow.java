package com.factorymeth;

public class BookMyShow {

	public static void main(String[] args) {
		MovieHall m1=MovieHall.getTicket();
		System.out.println(m1);
		m1.book(1509);
		m1.book(50);
		
		m1.book(50);
		m1.book(50);
		
		MovieHall m2=MovieHall.getTicket();
		System.out.println(m2);
		m2.book(60);

	}

}
