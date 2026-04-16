package com.encapsulation;
import java.util.*;
public class MobileDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Flipkart:");
		boolean r=true;
		Mobile m=null;
		do {
			System.out.println("1.Add mobile\n 2.fetch details\n 3.fetch price\n 4.Change Color\n 5.Exit\n");
			int n=sc.nextInt();
			switch(n) {
			case 1:{
				System.out.println("Enter details");
				System.out.println("enter mobile name");
				String name=sc.next();
				System.out.println("enter mobile RAM");
				int ram=sc.nextInt();
				System.out.println("enter mobile ROM");
				int rom=sc.nextInt();
				System.out.println("enter mobile color:");
				String color=sc.next();
				System.out.println("enter mobile price");
				double price=sc.nextDouble();
				m=new Mobile(name,ram,rom,color,price);
			}
				break;
			case 2: {
				if(m==null) System.out.println("NO mobiles added");
				else
				m.display();
				break;
			}
			case 3: {
				if(m==null) System.out.println("NO mobiles added");
				else
				System.out.println(m.getPrice());
				break;
			}
			case 4: {
				if(m==null) System.out.println("NO mobiles added");
				else {
				
				System.out.println("Old Mobile color:"+m.getColor());
				System.out.println("Enter new Color:");
				String newcolor=sc.next();
				m.setColor(newcolor);
				System.out.println("New Mobile color:"+m.getColor());
				}
				
				break;
			}
			case 5: {
				r=false;
				break;
			}
			default: System.out.println("INVALID INPUT");
			
			}
			
		}while(r);
	}

}
