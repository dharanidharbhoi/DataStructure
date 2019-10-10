package com.dharani.problems;

import java.util.Optional;

public class OptionalMain {

	public static void main(String[] args) {
		
		Address addr1 = new Address("test", "landmark", "pincode");
		
	    Person p1 = new Person(11, "with not null", Optional.of(addr1));
	    Person p2 = new Person(11, "with not null", Optional.empty());
	    
	    
	    Address addr = p2.getAddress().orElse(new Address("test", "landmark", "pincode"));
	    
	    
	    

	}

}
