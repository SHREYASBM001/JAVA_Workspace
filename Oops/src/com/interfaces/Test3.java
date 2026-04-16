package com.interfaces;
interface Iphone17 {
	void powerOn();
}
interface Iphone18{
	// String powerOn(); Ambiguity,same methodname,different return type
	void powerOn();
	
}
class Mobiles implements Iphone17,Iphone18 {
	public void powerOn() {
		
			System.out.println("powerOn impl in all Mobiles");
		
	}
} 
public class Test3 {

	public static void main(String[] args) {
		Iphone17 i17=new Mobiles();
		i17.powerOn();
	}

}
