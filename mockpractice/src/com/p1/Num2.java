package com.p1;

public class Num2 {

	public static void main(String[] args) {
		int n=5;
		int x=0;
		int z;
		int y;
		
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				z=x+1;
				for(int j=1;j<=i;j++) {
					System.out.print(z+"\t");
					z++;
				}
			} else {
				y=x+i;
				for(int j=1;j<=i;j++) {
					System.out.print(y+"\t");
					y--;
				}
			}
			x+=i;
			System.out.println();
			
			
		}
	}

}
