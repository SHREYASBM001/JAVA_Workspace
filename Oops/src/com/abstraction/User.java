package com.abstraction;
import java.util.*;
@FunctionalInterface
interface Payble {
	void pay();
}
class UPI implements Payble {
	public void pay() {
		System.out.println("Paid Using UPI");
	}
}
class CreditCard implements Payble {
	public void pay() {
		System.out.println("Paid using Credit Card");
	}
}

public class User {
	static Payble get()
	{
		System.out.println("1.UPI\n2.CreditCard\n3.none");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1) return new UPI();
		else if(n==2) return new CreditCard();
		else {
			System.out.println("Invalid Input");
			return null;
		}
	} 
	public static void main(String[] args) {
		Payble p=get();
		p.pay();
		

	}

}
