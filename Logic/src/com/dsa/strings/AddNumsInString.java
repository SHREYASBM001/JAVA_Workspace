package com.dsa.strings;

public class AddNumsInString {



		public static void main(String[] args) {
			String s="avyaK@#123R"; //Output should be: "KRyva123@#"
			String uc="";
			String lc="";
			int nc=0;
			String sp="";
			
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				if(ch>='A' && ch<='Z') {
					uc+=ch;
				}
				else if(ch>='a' && ch<='z') {
					lc+=ch;
				}
				else if(ch>='0' && ch<='9') {
					nc+=ch-'0';
				}
				else sp+=ch;
				
			}
			System.out.println(uc+lc+nc+sp);
			
		

	}


}
