package com.dharani.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * You can return the answer in any order.
 * 
 * Input: nums = [2,7,11,15], target = 9
 * 
 * Output: [0,1]
 * 
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 */
public class TwoSum {

	public static void main(String[] args) {
		
		int[] nums = {2,7,11,15};
		int target = 9;
		
		int[] result = twoSum(nums, target);
		System.out.println(result[0]+" , "+result[1]);

	}
	
    public static int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> numMap = new HashMap<>();
        
          numMap.put(nums[0],0);
        
        for(int i=1;i<nums.length;i++){
            
              Integer index = numMap.get(target - nums[i]);
            if(index != null){
                return new int[] {index,i};
            }
            
            numMap.put(nums[i],i);
        }
        

        
        return new int[] {-1,-1};
        
    }
}

