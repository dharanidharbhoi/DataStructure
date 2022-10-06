package com.dharani.lcs;

/* Dynamic Programming Java implementation of LCS problem */
public class LongestCommonSubsequence
{
 

 
public static void main(String[] args)
{
    LongestCommonSubsequence lcs = new LongestCommonSubsequence();
    String s1 = "AGGTABK";
    String s2 = "GXTXAYB";
 
    char[] X=s1.toCharArray();
    char[] Y=s2.toCharArray();
    int m = X.length;
    int n = Y.length;
 
    System.out.println("Length of LCS is" + " " +
                                lcs.lcs( X, Y, m, n ) );
    lcs.printlcs(X, Y, m, n);
}

private Integer lcs(char[] x, char[] y, int m, int n) {
	
	Integer[][] arr = new Integer[m+1][n+1];
	
	for(int i=0;i<=m;i++ ) {
		for(int j=0;j<=n;j++) {
			
			if(i == 0 || j==0) {
				arr[i][j] = 0;
			}else if( x[i-1] == y[j-1]) {
				arr[i][j] = 1+arr[i-1][j-1];
			}else {
				arr[i][j] = max(arr[i][j-1],arr[i-1][j]);
			}
			
		}
		
	}
	
	
	return arr[m][n];
}

private void printlcs(char[] x, char[] y, int m, int n) {
	
	Integer[][] arr = new Integer[m+1][n+1];
	
	for(int i=0;i<=m;i++ ) {
		for(int j=0;j<=n;j++) {
			
			if(i == 0 || j==0) {
				arr[i][j] = 0;
			}else if( x[i-1] == y[j-1]) {
				arr[i][j] = 1+arr[i-1][j-1];
			}else {
				arr[i][j] = max(arr[i][j-1],arr[i-1][j]);
			}
			
		}
		
	}
	
	String s = "";

	
	  int i= m;
	  int j= n;
	  
	  while(i >0  && j > 0) {
		  
		  if(x[i-1] == y[j-1]) {
			  s = x[i-1] + s;
			  i = i-1;
			  j = j-1;
		  }else {
			  if(arr[i-1][j] >= arr[i][j-1]) {
				  i = i-1;
			  }else {
				  j = j-1;
			  }
			  
		  }
		  
	  }
   
     
System.out.println(s);
     
     
     
}

private Integer max(Integer integer1, Integer integer2) {
	
	return integer1 > integer2 ? integer1 : integer2;
}


 
}
