package com.dharani.java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStream {

	public static void main(String[] args) {
		
		
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 353);
		map.put("B", 987);
		map.put("C", 6545);
		map.put("D", 87);
		
		Map<String,Integer> sortMap = map.entrySet().stream().
				sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (o1,o2) -> o1, LinkedHashMap::new));
		
		sortMap.entrySet().stream().forEach(e -> System.out.println("key " + e.getKey() + " value "+ e.getValue()));
		collections.un
      
		

	}

}
