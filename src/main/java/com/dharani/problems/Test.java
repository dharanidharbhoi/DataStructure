package com.dharani.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {
	void printRepeating(int arr[], int size) {
		int i;
		System.out.println("The repeating elements are : ");

		for (i = 0; i < size; i++) {
			if (arr[Math.abs(arr[i])] >= 0)
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			else
				System.out.print(Math.abs(arr[i]) + " ");
		}
	}

// Driver program  
	public static void main(String[] args) {
		/*
		 * List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
		 * 
		 * List<Integer> listOfIntegers = listOfStrings.stream() .map(Integer::valueOf)
		 * .collect(Collectors.toList());
		 * 
		 * System.out.println(listOfIntegers); //[1, 2, 3, 4, 5]
		 * 
		 * List<Integer> list1 = Arrays.asList(1,2,3); List<Integer> list2 =
		 * Arrays.asList(4,5,6); List<Integer> list3 = Arrays.asList(7,8,9);
		 * 
		 * List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);
		 * 
		 * 
		 * List<Integer> listOfAllIntegers = listOfLists.stream() .flatMap(x ->
		 * x.stream().filter(i -> i < 3)) .collect(Collectors.toList());
		 * 
		 * System.out.println(listOfAllIntegers);
		 */
		
		Comparator<Student> studentCompartor = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.id == o2.id) {
					return 0 ;
				}
				if(o1.id > o2.id) {
					return 1 ;
				}else {
					return -1 ;
				}
			}
		};
		
		Student st1 = new Student(1, "Dharani");
		Student st2 = new Student(2 ,"hello");
		Student st3  = new Student(10, "Bhubaneswar");
		Student st4 = new Student(5, "Odisha");
		Student st5 = new Student(1, "Raina");
		
		List<Student > studentList = Arrays.asList(st1,st2,st3,st4,st5);
		studentList.sort(studentCompartor);
		studentList.stream().forEach(s -> System.out.println(s.toString()));
		

	
	}
}
