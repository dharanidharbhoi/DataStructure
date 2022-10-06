package com.dharani.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee{
	
	
	private String name;
	
	private Integer salary;
	
	private Integer dept;
	
	

	public Employee(String name, Integer salary, Integer dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getSalary() {
		return salary;
	}



	public void setSalary(Integer salary) {
		this.salary = salary;
	}



	public Integer getDept() {
		return dept;
	}



	public void setDept(Integer dept) {
		this.dept = dept;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}

   	
	
}

public class StreamMain {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("A", 1000, 101));
		list.add(new Employee("B", 2000, 101));
		list.add(new Employee("C", 3000, 103));
		list.add(new Employee("D", 4000, 102));
		list.add(new Employee("E", 5000, 102));
		list.add(new Employee("F", 6000, 104));
	
	//mapping by Department	
	  Map<Integer,List<Employee>> deptMap = list.stream().collect(Collectors.groupingBy(Employee::getDept));
	//  deptMap.entrySet().stream().forEach( entry -> System.out.println("key " + entry.getKey()+" Value "+ entry.getValue() ));
	
   //finding highest salary of each departmen
	  Map<Integer, Optional<Employee>> salaryMap = list.stream().
			  collect(Collectors.groupingBy(Employee::getDept,Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));
	  
	//  salaryMap.entrySet().stream().forEach(entry -> System.out.println("key " + entry.getKey()+" Value "+ entry.getValue().get() ));
	  
	 //Max Salary person
	   Optional<Employee> maxEmp = list.stream().max(Comparator.comparing(Employee::getSalary));
	   if(maxEmp.isPresent()) {
		 //  System.out.println(maxEmp.get());
	   }
	   //Min Salary person
	   Optional<Employee> minEmp = list.stream().min(Comparator.comparing(Employee::getSalary));
	   if(minEmp.isPresent()) {
		 //  System.out.println(minEmp.get());
	   }
	   
    
		

		
	}

}
