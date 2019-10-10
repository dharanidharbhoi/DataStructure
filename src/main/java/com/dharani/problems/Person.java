package com.dharani.problems;

import java.util.Optional;

public class Person {
	
	
	private int id;
	private String name;
	private Optional<Address> address;
	public Person(int id, String name, Optional<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Optional<Address> getAddress() {
		return address;
	}
	public void setAddress(Optional<Address> address) {
		this.address = address;
	}
	
	
	
	

}
