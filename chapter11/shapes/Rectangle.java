/**
 * -------------------------------------------------
 * File name: Rectangle.java
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
 * <b>This class extends the functionality of the Shape class</b>
 * <hr>
 * Date created: Jan 12, 2018
 * <hr>
 * 
 * @author David Blair
 */
public class Rectangle extends Shape
{
	// class attributes
	private double length;
	private double width;

	/**
	 * 
	 * Description: Default constructor Date: Jan 12, 2018
	 */
	public Rectangle()
	{
		super();
		this.length = 0.0;
		this.width = 0.0;
	}

	/**
	 * 
	 * Description: Overloaded constructor
	 * Date: Jan 12, 2018
	 * @param name
	 * @param length
	 * @param width
	 * @throws NegativeDoubleException 
	 * 
	 */
	public Rectangle(String name, double length, double width) throws NegativeDoubleException
	{
		super(name);
		if(length < 0)
		{
			throw new NegativeDoubleException("Length can not be less than zero", length);
		}
		if(width < 0)
		{
			throw new NegativeDoubleException("Width can not be less than zero", width);
		}
		this.length = length;
		this.width = width;
	}

	/**
	 * 
	 * Method description: return length attribute value
	 * Date: Jan 12, 2018
	 * @return
	 * @return double
	 */
	public double getLength()
	{
		return length;
	}

	/**
	 * 
	 * Method description: set length attribute value
	 * Date: Jan 12, 2018
	 * @param length
	 * @return void
	 */
	public void setLength(double length)
	{
		this.length = length;
	}

	/**
	 * 
	 * Method description: get width attribute value
	 * Date: Jan 12, 2018
	 * @return
	 * @return double
	 */
	public double getWidth()
	{
		return width;
	}

	/**
	 * 
	 * Method description: set width attribute value 
	 * Date: Jan 12, 2018
	 * @param width
	 * @return void
	 */
	public void setWidth(double width)
	{
		this.width = width;
	}

	/**
	 * 
	 * Method description: annotation helps prevent mistakes and requires the method to be exactly
	 * like the base class method
	 * Date: Jan 12, 2018
	 * @return double
	 */
	@Override
	public double calculateArea()
	{
		return this.length * this.width;
	}

	/**
	 * 
	 * Method description: annotation helps prevent mistakes and requires the method to be exactly
	 * like the base class method
	 * Date: Jan 12, 2018
	 * @return String
	 */
	@Override
	public String toString()
	{
		// could take advantage of the base-class super.toString();
		return "Name: " + super.getName() + " - Length: " + Double.toString(length) + " Width: " + Double.toString(width);
	}
	
	public String toSave()
	{
		return "Rectangle," + super.toSave() + "," + length + "," + width;
	}

	/**
	 * 
	 * Method description: annotation helps prevent mistakes and requires the method to be exactly
	 * like the base class method
	 * Date: Jan 12, 2018
	 * @param Object
	 * @return boolean
	 */
	@Override
	public boolean equals(Object o)
	{
		if (!(o instanceof Rectangle))
			return false;

		if (((Rectangle) o).length == this.length && ((Rectangle) o).width == this.width)
			return true;
		else
			return false;
	}

}
