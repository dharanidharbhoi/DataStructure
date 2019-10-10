package com.dharani.problems;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapFlatmap {

	public static void main(String[] args) {
		
		/*
		 * List<String> mapList =
		 * Arrays.asList("First","Second","Thrid","Fourth","Fifth","Sixth");
		 * 
		 * mapList.stream().map(String :: toUpperCase).collect(Collectors.toList());
		 */
	
	List<List<String>> list = Arrays.asList(
			  Arrays.asList("a","C"),
			  Arrays.asList("b","D"));
			System.out.println(list);
			
	//	System.out.println(list.stream().map(Collection::stream).collect(Collectors.toList()));	
			
			System.out.println(list
					  .stream()
					  .flatMap(Collection::stream)
					  .collect(Collectors.toList()));
		
		

	}

}
