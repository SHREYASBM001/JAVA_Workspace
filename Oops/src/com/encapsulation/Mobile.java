package com.encapsulation;

public class Mobile {
	private String name;
	private int ram;
	private int rom;
	private String color;
	private double price;
	public Mobile(String name, int ram, int rom, String color, double price) {
		
		this.name = name;
		this.ram = ram;
		this.rom = rom;
		this.color = color;
		this.price = price;
	}
	public String getName() {
		return name;
	}

	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	 void display() {
		 System.out.println("Details:");
		 System.out.println(name+"\n"+ram+"\n"+rom+"\n"+color+"\n"+price+"\n");
	 }
	
	
}
