package com.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {
	public static void main(String[] args) {
		Emp[] e1= {new Emp("SHREYAS",99),new Emp("Anif",69),new Emp("Santhosh",65)};
		
		Arrays.asList(null)
		
//		Arrays.sort(e1);
//		Arrays.sort(e1,c);
		
//		Arrays.sort(e1,new Comparator() {
//			@Override
//			public int compare(Object o1,Object o2) {
//				Emp e1=(Emp)o1;
//				Emp e2=(Emp)o2;
//				return e1.name.compareTo(e2.name);
//			}
//		});
		
//		Comparator c=new Comparator() {
//			@Override
//			public int compare(Object o1,Object o2) {
//				Emp e1=(Emp)o1;
//				Emp e2=(Emp)o2;
//				return e1.name.compareTo(e2.name);
//			}
//		};
		
//		Arrays.sort(e1,(a,b)->{
//			Emp e2=(Emp)a;
//			Emp e3=(Emp)b;
//		return	e2.name.compareTo(e3.name);
//		});
//		System.out.println(Arrays.toString(e1));
		System.out.println(Arrays.toString(e1));
//		compare(name1,name2);
	}
}
