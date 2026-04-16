package com.downcasting;

public class VegShop {
	Vegetable sell(String v) {
		if(v.equals("carrot")) return new Carrot();
		if(v.equals("potato")) return new Potato();
		System.out.println(v+" Not available");
		return null;
	}
}
