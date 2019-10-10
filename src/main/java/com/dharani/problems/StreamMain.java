package com.dharani.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamMain {

	public static void main(String[] args) {
		
		//Filter
		List<Integer> filterList = Arrays.asList(1,2,3,4,5,6);
	//	filterList.stream().filter(num -> num > 3).forEach(System.out::print); 
		
		//map
		 System.out.println();
	//	 filterList.stream().map(k ->  k * 2).forEach(System.out::print);
		 
		 //map to double
		 System.out.println();
	//	 filterList.stream().mapToDouble(k -> k * 2).forEach(System.out::println);
		
		 
		 //flatMap
		 List<List<String>> flatMapList = new ArrayList<List<String>>();
		 flatMapList.add(Arrays.asList("A","B","C"));
		 flatMapList.add(Arrays.asList("1","2","3"));
		 flatMapList.add(Arrays.asList("I","II","III"));
		 
	//	 flatMapList.stream().flatMap(list -> list.stream()).forEach(System.out::println);
		 
		 //Distinct
          
		 List<Integer> distinctList = Arrays.asList(1,2,3,4,5,5,6,7,8,1,2,3,9,8,10);
//		 distinctList.stream().distinct().forEach(System.out::println);
		 
		 
		 //Sorted && limit
		 Comparator<Student> studentComparator = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				
				if(o1.id > o2.id)
					return 1;
				else
					return -1;
			}
		}; 
		
		Student s1 = new Student(10, "Dharani");
		Student s2 = new Student(125, "Dharani");
		Student s3 = new Student(16, "Dharani");
		Student s4 = new Student(180, "Dharani");
		List<Student> sortedList = Arrays.asList(s1,s2,s3,s4);
		
	//	sortedList.stream().sorted(studentComparator).limit(2).forEach(s -> System.out.println(s.id + " " + s.name));
		
		 //Sorted && skip
//		sortedList.stream().sorted(studentComparator).skip(2).forEach(s -> System.out.println(s.id + " " + s.name));
		
	//reduce 
	Student s = 	sortedList.stream().reduce((student1,student2) -> student1.id > student2.id ? student1 : student2).orElse(new Student(1, "default"));
//	System.out.println(s.id + "" + s.name);
	
	//Min & Max
	Student  minStud =  sortedList.stream().min(studentComparator).orElse(new Student(-1,"NoName"));
//	 System.out.println(minStud.id + " " + minStud.name); 
	 
	 Student maxStud =  sortedList.stream().max(studentComparator).orElse(new Student(-1,"NoName"));
//	 System.out.println(maxStud.id + " " + maxStud.name); 
	 
	// System.out.println(sortedList.stream().count());
	 
	 
	 //Predicate 
	 
	 Predicate<Student>  idPredicate = stud -> stud.id > 28;
	 
//	sortedList.stream().filter(idPredicate).forEach(System.out::println);
	 
	 //Cosumer
	 Consumer<List<Student>> studConsumer = studList -> studList.stream().forEach(stud -> stud.id = stud.id + 4);
	 
	 studConsumer.accept(sortedList);
	 sortedList.stream().forEach(System.out::println);
	
	 
	 //Optional 
	 
	 Optional<Student> optStudent = Optional.of(s1);
	 
	
	 
	 

	}

}
