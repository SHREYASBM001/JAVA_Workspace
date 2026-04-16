package com.dsa.arrays;

public class PrintTheCharacterHavingOneOccurances {

	public static void main(String[] args) {
		char[] ch= {'a','v','e','v','e','z','w'};
		
		
		for(int i=0;i<ch.length;i++) {
			boolean flag=true;
			for(int j=0;j<ch.length;j++) {
				
				if(ch[i]==ch[j] && i!=j) {
					flag=false;
					
				}	
			}
			
			if((flag))
			System.out.println(ch[i]);
		}

	}

}
