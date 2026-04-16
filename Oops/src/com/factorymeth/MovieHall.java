package com.factorymeth;

public class MovieHall {
	int seat=100;
	static MovieHall m;
	private MovieHall() {
		
	}
 void book(int n) {
	if(n>seat) 
		{
		System.out.println("ERROR!.Entered Seats are more than available seats");
		System.out.println("Available Seats:"+seat);
		}
	
	if(n>0 && n<=seat) {
		seat-=n;
		System.out.println(n+" Seats booked");
		System.out.println(" Available Seats:"+seat);
		}
		}
 public static MovieHall getTicket() {
	 System.out.println(m);
	 if(m==null) {
		 m=new MovieHall();
		 return m;
	 }
	 else return m;
 }
 }

