package com.dateandtime;
import java.time.LocalDate;
import java.util.*;
public class Test1 {
	public static void main(String[] args) {
		System.out.print("Enter the Year:");
		System.out.println();
		String s=new Scanner(System.in).next();
		System.out.print("Enter the Month in Numbers:");
		System.out.println();
		String s2=new Scanner(System.in).next();
		System.out.print("Enter the Day in Numbers:");
		System.out.println();
		String s3=new Scanner(System.in).next();
		if(Integer.parseInt(s2)<10 && s2.toString()!='0'+s2.toString()) {
			s2='0'+s2;
		}
		if(Integer.parseInt(s3)<10 && s3.toString()!='0'+s3.toString()) {
			s3='0'+s3;
		}
		String fin=s+"-"+s2+"-"+s3;
		LocalDate ld=LocalDate.parse(fin);
		System.out.println("The entered date is:"+ld);
		System.out.println("Details of Entered Date");
		System.out.println("year:"+ld.getYear()+"\nMonth:"+ld.getMonthValue()+"\nDay:"+ld.getDayOfWeek());
		
		
	}
}
