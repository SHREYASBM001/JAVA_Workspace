public class Main {
	public static void main (String [] args) {
		String s = "abccccdd";
		System.out.println(Solution.longestPalindrome(s));
	}
}
class Solution {
    public static int longestPalindrome(String s) {
        int max=0;
		boolean flag=true;
        int i=0;
        while(!s.isEmpty()){
			
            int count=s.length()-s.replace(s.charAt(i)+"","").length();

            if(count%2==0){
                max+=count;
                s=s.replace(s.charAt(i)+"","");
            }else{
                if(count>1){
                max+=count;
                s=s.replace(s.charAt(i)+"","");
                } 
                else if(count==1 && flag){
                    max+=count;
                    s=s.replace(s.charAt(i)+"","");
                    flag=false;
                }
            }
        }
        return max;

    }
    
}
   