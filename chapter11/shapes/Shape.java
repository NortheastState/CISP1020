/**
 * -------------------------------------------------
 * File name: Shape.java
 * Project name: CISP1020
 * -------------------------------------------------
 * Creator's name: David Blair
 * Email: dlblair@northeaststate.edu
 * Course and section: CISP 1020 A01
 * Creation date: Jan 11, 2018
 * -------------------------------------------------
 */
package chapter11.shapes;

/**
 * 
 * <b>Class template for shape</b>
 * <hr>
 * Date created: Jan 12, 2018
 * <hr>
 * @author David Blair
 */
public class Shape
{
	//class attributes or properties
	private String name;
	
	/**
	 * 
	 * Description: Default Constructor
	 * Date: Jan 12, 2018
	 */
	public Shape()
	{
		this.name = "TBD";
	}
	
	/**
	 * 
	 * Description: Overloaded Constructor
	 * @param name
	 * Date: Jan 12, 2018
	 */
	public Shape(String name)
	{
		this.name = name;
	}

	/**
	 * 
	 * Description: Copy Constructor
	 * @param shape
	 * Date: Jan 12, 2018
	 */
	public Shape(Shape shape)
	{
		this.name = shape.getName();
	}

	/**
	 * 
	 * Method description: Return name attribute
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
	 * Method description: set name attribute
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
	 * Method description: defining calculateArea here makes late binding possible
	 * base class has not calculateArea method so no Override necessary
	 * Date: Jan 12, 2018
	 * @return double
	 */
	public double calculateArea()
	{
		return 0.0;
	}
	
	//defined in base class, override here and in child

	/**
	 * 
	 * Method description: override base class toString behavior
	 * Date: Jan 12, 2018
	 * @return String
	 */
	@Override
	public String toString()
	{
		return "Shape Class: ";
	}
	
	//defined in base class, override here and in child
	/**
	 * 
	 * Method description: override base class equals behavior
	 * Date: Jan 12, 2018
	 * @return boolean
	 */
	@Override
	public boolean equals(Object o)
	{
		return false;	
	}
	
}
