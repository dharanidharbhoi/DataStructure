package com.dharani.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * 
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and
 * '0's (water), return the number of islands.
 * 
 * An island is surrounded by water and is formed by connecting adjacent lands
 * horizontally or vertically. You may assume all four edges of the grid are all
 * surrounded by water.
 * 
 * Input: grid = [
 * 
 * ["1","1","1","1","0"],
 * 
 * ["1","1","0","1","0"],
 * 
 * ["1","1","0","0","0"],
 * 
 * ["0","0","0","0","0"]
 * 
 * ]
 * 
 * Output: 1
 *
 */
public class NumberOfIsland {

	public static void main(String[] args) {

		int[][] grid = { { 1, 1, 1, 1, 0 }, { 1, 1, 0, 1, 0 }, { 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0 } };

		int numberOfIsland = numIslands(grid);
		
		System.out.println("Number of Island are " + numberOfIsland);
	}

	public static int numIslands(int[][] grid) {
		
		   if(grid == null || grid.length == 0) {
			   return 0;
		   }
		   int numberOfIsland =0;
		 
		   for(int i=0;i< grid.length ; i++) {
			   
			   for(int j=0;j<grid[i].length;j++) {
				   
				   if(grid[i][j] == 1) {
					   depthFirstSearch(grid,i ,j,grid.length,grid[i].length);
					   numberOfIsland++;
				   }
				   
			   }
			   
		   }
		   
		   
		   
		return numberOfIsland;

	}

	private static void depthFirstSearch(int[][] grid,int i,int j,int column,int row ) {

		
		    if(i < 0 || i >= column || j < 0 || j >= row || grid[i][j] != 1) {
		    	return ;
		    }
          
		   grid[i][j] = 2;
		   
		   depthFirstSearch(grid, i-1, j, column, row);
		   depthFirstSearch(grid, i, j-1, column, row);
		   depthFirstSearch(grid, i+1, j, column, row);
		   depthFirstSearch(grid, i, j+1, column, row);

		    
          
          
		
	}
	
	
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> numMap = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            numMap.put(nums[i],i);
        }
        
        for( int j =0;j<nums.length;j++){
            
            int res = target - nums[j];
            Integer index = numMap.get(res) ;
            if(index != null && index != j){
                return new int[] {j,numMap.get(res)};
            }
        }
        
        return new int[] {-1,-1};
        
    }
}