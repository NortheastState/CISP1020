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

/**
 * 
 * <b>Base class for system</b>
 * <hr>
 * Date created: Jan 12, 2018
 * <hr>
 * @author David Blair
 */
public class Person
{
	// class attributes
	private String name;
	private String address;
	private String phoneNumber;
	
	/**
	 * 
	 * Description: Default constructor
	 * Date: Jan 12, 2018
	 */
	public Person()
	{
		this.name = "";
		this.address = "";
		this.phoneNumber = "";
	}

	/**
	 * 
	 * Description: Overloaded constructor
	 * @param name
	 * @param address
	 * @param phoneNumber
	 * Date: Jan 12, 2018
	 */
	public Person(String name, String address, String phoneNumber)
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * 
	 * Description: Copy constructor
	 * @param person
	 * Date: Jan 12, 2018
	 */
	public Person(Person person)
	{
		this.name = person.name;
		this.address = person.address;
		this.phoneNumber = person.phoneNumber;
	}

	/**
	 * 
	 * Method description: get name attribute for class
	 * Date: Jan 12, 2018
	 * @return
	 * @return String
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * 
	 * Method description: set name attribute for class
	 * Date: Jan 12, 2018
	 * @param name
	 * @return void
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * 
	 * Method description: get address attribute for class
	 * Date: Jan 12, 2018
	 * @return
	 * @return String
	 */
	public String getAddress()
	{
		return address;
	}

	/**
	 * 
	 * Method description: set address attribute for class
	 * Date: Jan 12, 2018
	 * @param address
	 * @return void
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}

	/**
	 * 
	 * Method description: get phone number attribute for class 
	 * Date: Jan 12, 2018
	 * @return
	 * @return String
	 */
	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	/**
	 * 
	 * Method description: set phone number attribute for class
	 * Date: Jan 12, 2018
	 * @param phoneNumber
	 * @return void
	 */
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
		
	/**
	 * 
	 * Method description: defined in base class, override here and in child
	 * Date: Jan 12, 2018
	 * @return String
	 */
	@Override
	public String toString()
	{
		return "Person Class: ";
	}
	
	/**
	 * 
	 * Method description: defined in base class, override here and in child
	 * Date: Jan 12, 2018
	 * @param Object o
	 * @return boolean
	 */
	@Override
	public boolean equals(Object o)
	{
		return false;	
	}
}
