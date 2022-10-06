package com.dharani.problems2;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		System.out.println(firstUniqChar("loveleetcode"));

	}
	
	
	  public static int firstUniqChar(String s) {
		  
		  
          int[] freq = new int[256];
     for (char c : s.toCharArray()) {
         freq[c - 'a']++;
     }
     for (int i = 0; i < s.length(); i++) {
         if (freq[s.charAt(i) - 'a'] == 1) return i;
     }
     return -1;
	        
	    }

}
