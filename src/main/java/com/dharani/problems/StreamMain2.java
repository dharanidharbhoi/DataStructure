package com.dharani.problems;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
	
	Integer id;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptId=" + deptId + ", salary=" + salary + "]";
	}

	String name;
	Integer deptId;
	Integer salary;
	
	public Integer getSalary() {
		return salary;
	}
	
	public Employee(Integer id , String name,Integer deptId,Integer salary) {
		this.id = id;
		this.name = name;
		this.deptId = deptId;
		this.salary = salary;
	}
}

public class StreamMain2 {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "A", 10,1000));
		list.add(new Employee(2, "B", 10,3000));
		list.add(new Employee(3, "C", 11,1500));
		list.add(new Employee(4, "D", 11,1000));
		list.add(new Employee(5, "E", 11,5000));
		list.add(new Employee(6, "F", 12,8000));
		
		//Map by Department
		Map<Integer , List<Employee>> deptEmpMap = list.stream().collect(Collectors.groupingBy(Employee::getDeptId));
		deptEmpMap.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " " + e.getValue().toString()));
		
		//Map by Department with sorted highest salary
		
		Map<Integer, Optional<Employee>> highSalaryEmpMap = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptId,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		highSalaryEmpMap.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " " + e.getValue().toString()));
		
		
		
    		  
    		  



		

	}

}
