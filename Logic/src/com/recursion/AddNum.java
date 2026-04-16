package com.recursion;

public class AddNum {

	public static void main(String[] args) {
		System.out.println(addNum(5));

	}
	static int addNum(int n) {
		if(n<=0) return 0;
		if(n==1) return 1;
		return n+addNum(n-1);
	}

}
