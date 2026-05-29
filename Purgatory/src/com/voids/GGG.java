package com.voids;

public class GGG {
	public static void main (String [] args) {
		String s = "abccccdd";
		System.out.println(Solution.longestPalindrome(s));
	}
}
class Solution {
    public static int longestPalindrome(String s) {
        int max=0;
		boolean flag=true;
     
        while(!s.isEmpty()){
			
            int count=s.length()-s.replace(s.charAt(0)+"","").length();

            if(count%2==0){
                max+=count;
                s=s.replace(s.charAt(0)+"","");
                System.out.println(s);
            }else{
                if(count>1){
                max+=count;
                s=s.replace(s.charAt(0)+"","");
                System.out.println(s);
                } 
                else if(count==1 && flag){
                    max+=count;
                    s=s.replace(s.charAt(0)+"","");
                    System.out.println(s);
                    flag=false;
                }
            }
        }
        return max;

    }
    
}
   