package com.dharani.problems2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindRelatedGroups {

	public static void main(String[] args) {
		

		List<String> nameList = new ArrayList<String>(); 
		
		
		
		nameList.add("Rahul Dev");
		nameList.add("Rahul Singh");
		nameList.add("Kapil Dev ");
		nameList.add("Anurag Kapil");
		
		
		
		getRelatedGroup(nameList);
		
		
		
		
		
		
		

	}

	private static void getRelatedGroup(List<String> nameList) {
		
		
	    Map<Integer,Set<String>> relateGroupMap = new HashMap<>();
	    
	    for(String name : nameList) {
	    	String[] names = name.split(" ");
	    	System.out.println(names[0] + " "+ names[1]);

	    	
	    }
		
		
	}

}
