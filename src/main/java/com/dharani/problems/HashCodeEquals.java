package com.dharani.problems;

import java.util.HashSet;
import java.util.Set;

public class HashCodeEquals {

	public static void main(String[] args) {
	
		Student s1 = new Student(1,"Dharani");
		Student s2 = new Student(1,"Dharani");
		
		Set<Student> studentSet = new HashSet<>();
		studentSet.add(s1);
		studentSet.add(s2);

		System.out.println(studentSet.size());
		System.out.println(s1.equals(s2) );

	}

}
