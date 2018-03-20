package com.cisc181.core;

public class PersonException extends Exception 
{
	private Person person;
	
	public PersonException (String message, Person person)
	{
		super(message);
		this.person = person;
	}
	
	public Person getPerson()
	{
		return person;
	}
	
}
