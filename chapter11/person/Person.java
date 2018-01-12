/**
 * -------------------------------------------------
 * File name: Person.java
 * Project name: CISP1020
 * -------------------------------------------------
 * Creator's name: David Blair
 * Email: dlblair@northeaststate.edu
 * Course and section: CISP 1020 A01
 * Creation date: Jan 11, 2018
 * -------------------------------------------------
 */
package chapter11.person;

public class Person
{
	private String name;
	private String address;
	private String phoneNumber;
	
	public Person()
	{
		this.name = "";
		this.address = "";
		this.phoneNumber = "";
	}

	public Person(String name, String address, String phoneNumber)
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public Person(Person person)
	{
		this.name = person.name;
		this.address = person.address;
		this.phoneNumber = person.phoneNumber;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
		
	//defined in base class, override here and in child
	@Override
	public String toString()
	{
		return "Person Class: ";
	}
	
	//defined in base class, override here and in child
	@Override
	public boolean equals(Object o)
	{
		return false;	
	}
}
