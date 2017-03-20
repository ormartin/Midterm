package com.cisc181.core;

public class PersonException extends Exception{
	private Person P;
	private String newPhone_number;
	
	public PersonException(Person P) {
		this.P = P;
	}
	public PersonException(String newPhone_number) { 
		this.newPhone_number = newPhone_number;
	}
}