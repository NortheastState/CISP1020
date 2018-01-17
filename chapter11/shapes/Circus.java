/**
 * -------------------------------------------------
 * File name: Circus.java
 * Project name: CISP1020
 * -------------------------------------------------
 * Creator's name: David Blair
 * Email: dlblair@northeaststate.edu
 * Course and section: CISP 1020 A01
 * Creation date: Jan 17, 2018
 * -------------------------------------------------
 */
package chapter11.shapes;

import java.util.ArrayList;

/**
 * <b>A Circus is full of all kinds of shapes
 * for the young at heart to enjoy. We will use
 * an ArrayList container to create lots of different
 * shaped balloons 
 * 
 * This can be thought of as a driver to functional test
 * the object hierarchy.
 * </b>
 * <hr>
 * Date created: Jan 17, 2018
 * <hr>
 * @author David Blair
 */
public class Circus
{

	/**
	 * Method description: Console Java applications entry point is main()
	 * Date: Jan 17, 2018
	 * @param args
	 * @return void
	 */
	public static void main(String[] args)
	{
		ArrayList<Shape> balloons = new ArrayList<Shape>();
		
		balloons.add(new Circle("Red Circle Balloon", 15.5));
		balloons.add(new Circle("Green Circle Balloon", 22.3));
		balloons.add(new Rectangle("Yellow Rectangle Balloon", 10.5, 20.5));
		balloons.add(new Rectangle("Blue Rectangle Balloon", 9.0, 21.2));
		
		// Show all balloons.
		// Important: Notice polymorphism at work. The arraylist
		// is the type Shape but we only place child objects in it.
		for(Shape shape : balloons)
		{
			System.out.println(shape.toString());
		}
	}

}
