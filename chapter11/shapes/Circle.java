/**
 * -------------------------------------------------
 * File name: Circle.java
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
 * <b>Extend the functionality of Shape class</b>
 * <hr>
 * Date created: Jan 12, 2018
 * <hr>
 * @author David Blair
 */
public class Circle extends Shape
{
	//class attributes
	private double radius = 0.0;
	
	/**
	 * 
	 * Description: Default Constructor
	 * Date: Jan 12, 2018
	 */
	public Circle()
	{
		super();
		this.radius = 0.0;
	}
	
	/**
	 * 
	 * Description: Overloaded Constructor
	 * @param name
	 * @param radius
	 * Date: Jan 12, 2018
	 * @throws NegativeDoubleException 
	 */
	public Circle(String name, double radius) throws NegativeDoubleException
	{
		super(name);
		if(radius < 0)
		{
			throw new NegativeDoubleException("The radius must be a positive number", radius);
			
		}
		this.radius = radius;
	}

	/**
	 * 
	 * Description: Copy Constructor
	 * @param circle
	 * Date: Jan 12, 2018
	 */
	public Circle(Circle circle)
	{
		super(circle);
		this.radius = circle.getRadius();
	}
			
	/**
	 * 
	 * Method description: Return radius attribute
	 * Date: Jan 12, 2018
	 * @return
	 * @return double
	 */
	public double getRadius()
	{
		return radius;
	}

	/**
	 * 
	 * Method description: Set radius attribute
	 * Date: Jan 12, 2018
	 * @param radius
	 * @return void
	 */
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	/** Method description: Returns the area of this shape. 
	 * Annotation helps prevent mistakes and requires the
	 * method signature to be exactly like the base class method.
	 * Date: Jan 12, 2018
	 * @return double
	 */
	@Override
	public double calculateArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}

	/** Method description: Returns the string value for this class. 
	 * Annotation helps prevent mistakes and requires the
	 * method signature to be exactly like the base class method.
	 * Date: Jan 12, 2018
	 * @return String
	 */
	@Override
	public String toString()
	{
		return "Name: " + super.getName() + " - Radius: " + Double.toString(radius);
	}
	
	/** Method description: Compares two like objects for equality.
	 * Annotation helps prevent mistakes and requires the
	 * method signature to be exactly like the base class method.
	 * Date: Jan 12, 2018
	 * @return boolean
	 */
	@Override
	public boolean equals(Object o)
	{		
		if (!(o instanceof Circle)) {
            return false;
        }
			
		double rad = ((Circle)o).getRadius();
		if ( rad == this.radius )
			return true;
		else
			return false;
	}
	                           
	public String toSave()
	{
		return "Circle," + super.toSave() + "," + radius;
	}
}
