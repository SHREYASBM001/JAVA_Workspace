package com.logica;
//n=153,then length of n=3,then 1'3 + 5'3 + 3'3=153 (then its armstrong number(" ' " - means power))
import java.util.Scanner;
public class ArmStrongNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	 int n=sc.nextInt();
	
	System.out.println(isArmStrongNum(n));
	// System.out.println(getPower(n));
	// System.out.println(calcPower(3,3));
	}
	static boolean isArmStrongNum(int n) {
		int m=n;
		int sum=0;
		int pow=getPower(n);
		
	while(n>0) {
		sum+=calcPower(n%10,pow);
		n/=10;
	}
	return m==sum ;
	}
	static int calcPower(int n,int power) {
		
		int prod=1;
		for(int i=1;i<=power;i++) {
			
			prod*=n;
			
		}
		return prod;
	}
	static int getPower(int n) {
		if(n==0) return 1; // when n=0,number of digits is 1 logically,not zero..it works without this line,but this is correct logic
		int count=0;
		while(n>0) {
			n/=10;
			count++;
		}
		return count;
	}

}
