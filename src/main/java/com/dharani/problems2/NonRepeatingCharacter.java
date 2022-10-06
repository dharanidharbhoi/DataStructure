package com.dharani.problems2;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		

		char[] arr = "GeeksforGeeks".toCharArray();
		
		
		Map<Character,Integer> charmap = new LinkedHashMap<>();
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(charmap.containsKey(arr[i])) {
				charmap.put(arr[i],charmap.get(arr[i])+1);
				
			}else {
				charmap.put(arr[i],1);
			}
			
		}
		
	Optional<Entry<Character,Integer>> resultMap =	charmap.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst();
		
	
	if(resultMap.isPresent()) {
		System.out.println(resultMap.get().getKey());
	}
 
	
	}

}
