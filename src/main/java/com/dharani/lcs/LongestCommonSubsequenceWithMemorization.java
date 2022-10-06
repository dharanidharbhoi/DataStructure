package com.dharani.lcs;

public class LongestCommonSubsequenceWithMemorization {

	public static void main(String[] args) {
		
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";
		
		Integer[][] result = new Integer[s1.length()][s2.length()];
		
		System.out.println(LCSWithMemorization(0,0,s1.toCharArray(),s2.toCharArray(),result));
		
	}


	private static int LCSWithMemorization(int i, int j, char[] ch1, char[] ch2,Integer[][] result) {
		
		 if(i >= ch1.length || j >= ch2.length) {
			 return 0;
		 }else if(ch1[i] == ch2[j]){
			 return result[i][j] =  1 + LCSWithMemorization(i+1,j+2,ch1 ,ch2,result);
		 }
		 
		 if(result[i][j] != null) {
			 return result[i][j];
		 }else {
			 return result[i][j] = max(LCSWithMemorization(i+1,j,ch1,ch2,result),LCSWithMemorization(i,j+1,ch1,ch2,result));
		 }
			 
		 
		
		
	}

	private static int max(int lcs1, int lcs2) {
		return lcs1 >= lcs2 ? lcs1 : lcs2;
	}

}
