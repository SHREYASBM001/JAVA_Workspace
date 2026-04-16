package com.downcasting;

import java.util.Scanner;

class Vegetables {
	
}
class LadiesFinger extends Vegetables {
	void Ladiesfry() {
		System.out.println("Cripsy Ladies fry is Ready");
	}
}
class MansFinger extends Vegetables {
	void Manfry() {
		System.out.println("Man's fry ready");
	}
}
class Vegshop {
	Vegetables sell(String v) {
		if(v.equals("ladiesfinger")) return new LadiesFinger();
		if(v.equals("mansfinger")) return new MansFinger();
		System.out.println(v+" Not available");
		return null;
	}
}

public class Test3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a finger you want: (1).ladiesfinger,(2).mansfinger");
		String vg =sc.next();
	    Vegshop vs=new Vegshop();
		Vegetables v=vs.sell(vg);
		if(v instanceof LadiesFinger) {
			((LadiesFinger)v).Ladiesfry();
		}
		if(v instanceof MansFinger) {
		((MansFinger)v).Manfry();	
		}
		else return;
		
		sc.close();
			}
		}


	


