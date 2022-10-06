package com.dharani.graph;

/**
 * 
 * There are n cities. Some of them are connected, while some are not. If city a
 * is connected directly with city b, and city b is connected directly with city
 * c, then city a is connected indirectly with city c.
 * 
 * A province is a group of directly or indirectly connected cities and no other
 * cities outside of the group.
 * 
 * You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the
 * ith city and the jth city are directly connected, and isConnected[i][j] = 0
 * otherwise.
 * 
 * Return the total number of provinces.
 * 
 * Input: isConnected = [[1,1,0],
 * 
 *                       [1,1,0],
 * 
 *                       [ 0,0,1]]
 * 
 * Output: 2
 *
 */
public class NumberOfProvinces {

	public static void main(String[] args) {
		
		int[][] isConnected = {{1,0,0,1},
		                       {0,1,1,0},
		                       {0,1,1,1},
		                       {1,0,1,1}};
		
	    int num = findCircleNum(isConnected);
	    
	    System.out.println("The number of connected province is " + num);

	}

	private static int findCircleNum(int[][] isConnected) {
		
		  if(isConnected == null || isConnected.length == 0) {
			  return 0;
		  }
		  
		   int province =0 ;
		   boolean[] visited = new boolean[isConnected.length];
		   
		  for(int i=0;i<isConnected.length;i++) {
			  
			    
			  if(visited[i] == false) {
				  province++;
				  dfs(isConnected,i,visited);
				  
			  }
		      
			  
		  }
		
		
		return province;
	}


	
	
	  private static void dfs(int[][] isConnected, int i, boolean[] visited) {
		
		 visited[i] = true;
		 
		 for(int j=0;j<isConnected[i].length;j++) {
			 if(isConnected[i][j] == 1 && visited[j] == false) {
				 dfs(isConnected, j,visited);
			 }
			 
		 }
		  
		
	}

	public static int findCircleNum1(int[][] isConnected) {
	        boolean [] visited = new boolean[isConnected.length];
	        int islands = 0 ;
	        for(int i = 0 ; i< isConnected.length ;i++){
	            if(visited[i] == false){
	                islands++;
	                dfs(isConnected, visited, i);
	            }
	        }
	        return islands;
	    }
	    
	    public static void dfs(int[][] isConnected , boolean[] visited, int i){
	        visited[i] = true;
	        for(int j = 0 ; j< isConnected[0].length ; j++){
	            if(isConnected[i][j] == 1 && visited[j] == false)
	                dfs(isConnected, visited, j);
	        }
	    }

}
