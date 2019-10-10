package com.dharani.problems;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
    
        sc.close();
        
        System.out.println(isAnagram(a ,b) ? "Anagrams" : "Not Anagrams");
        
	
	}

	private static boolean isAnagram(String a, String b) {
		   a = a.toLowerCase();
		   b = b.toLowerCase();
		 if(a.length() != b.length()) {
			 return false;
		 }
		 int[] freq_a = new int[26];
		 int[] freq_b = new int[26];
		 
		 for(int i=0;i<a.length();i++) {
			 freq_a[a.charAt(i) - 'a']++;
			 freq_b[b.charAt(i) - 'a']++;
		 }
		 
		 for(int i=0;i<a.length();i++) {
			 if(freq_a[a.charAt(i)-'a'] != freq_b[a.charAt(i)-'a'] ) {
				 return false;
			 }
		 }
		
		return true;
		
	}

}
