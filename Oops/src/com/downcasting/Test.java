package com.downcasting;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Veggies: (1).carrot,(2).potato");
		String vg =sc.next();
	    VegShop vs=new VegShop();
		Vegetable v=vs.sell(vg);
		if(v instanceof Carrot) {
			((Carrot)v).hal();
		}
		if(v instanceof Potato) {
		((Potato)v).fry();	
		}
		else return;
		
		sc.close();
	}

}
