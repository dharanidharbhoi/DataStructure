package com.dharani.problems;

public class Address {
	
   private String street;
   private String landmark;
   private String pincode;
   
   public Address(String street, String landmark, String pincode) {
		super();
		this.street = street;
		this.landmark = landmark;
		this.pincode = pincode;
	}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getLandmark() {
	return landmark;
}

public void setLandmark(String landmark) {
	this.landmark = landmark;
}

public String getPincode() {
	return pincode;
}

public void setPincode(String pincode) {
	this.pincode = pincode;
}
   
   
   
   
   

}
