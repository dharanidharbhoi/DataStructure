package com.dharani.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OccurenceOfCharacter {
	
	public static void printOccurenceOfCharacter(String line) {
		
		Map<Character, Integer> occurenceMap = new HashMap<>();
		
		char[] lineArray = line.toCharArray();
		for(int i=0;i<line.length();i++) {
			occurenceMap.computeIfPresent(lineArray[i], (k,v) -> v + 1 );
			occurenceMap.computeIfAbsent(lineArray[i], k -> 1);
		}
		
		occurenceMap.forEach((k,v) -> System.out.println(k +"  "+v));
		
		/*
		 * for(Entry<Character, Integer> map : occurenceMap.entrySet()) {
		 * System.out.println(map.getKey() + "  "+ map.getValue()); }
		 */
		
	}

	public static void main(String[] args) {
		
		printOccurenceOfCharacter("dharanidharbhoi");
		
		
	}

}
