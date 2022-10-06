package com.dharani.problems2;

import java.util.HashSet;
import java.util.Set;

public class FindingDuplicate {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		
		System.out.println(containsDuplicate(nums));
	}
	
	
    public static boolean containsDuplicate(int[] nums) {
    	
    	Set<Integer> number = new HashSet<>();
    	
    	
    	for(int i=0;i<nums.length;i++) {
    		
    		if(!number.add(nums[i])) {
    			return true;
    		}
    	}
    	
    	
    	
    	return false;
        
    }
}
