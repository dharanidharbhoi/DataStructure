package com.dharani.problems2;

public class ReverseString {

	public  static void main(String[] args) {
		
		
		int x = 1534236469;
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            rev = rev * 10 + pop;
        }
		
		System.out.println(rev);
      

	}
	
	public void reverseString() {
		char[] s =  {'h','e','l','l','o'};

        int length = s.length-1;
         for(int i=0;i<s.length/2;i++) {
      	   char temp = s[i];
      	   s[i] = s[length-i];
      	   s[length-i] = temp;
         }
         
         
         for(int i=0;i<= length;i++) {
      	   System.out.println(s[i]);
         }

	}
	
	
	public  void reverseInteger() {

	}

}
