package com.rest.webservices.restfulwebservices.versioning;

public class Name {
	
	private String firstName;
	private String lasName;
	public Name(String firstName, String lasName) {
		super();
		this.firstName = firstName;
		this.lasName = lasName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLasName() {
		return lasName;
	}
	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lasName=" + lasName + "]";
	}
	
	

}
