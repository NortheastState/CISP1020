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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

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
		
		double diameter1 = 15.5;
		double diameter2 = 22.3;
		double length1 = 10.5;
		double length2 = 9.0;
		double width1 = 20.5;
		double width2 = 21.2;
		
		try
		{
			balloons.add(new Circle("Red Circle Balloon", diameter1));
			balloons.add(new Circle("Green Circle Balloon", diameter2));
			balloons.add(new Rectangle("Yellow Rectangle Balloon", length1, width1));
			balloons.add(new Rectangle("Blue Rectangle Balloon", length2, width2));
		}
		catch(NegativeDoubleException err)
		{
			JOptionPane.showMessageDialog(null, err.getMessage());
			System.exit(-1);
		}
		
		
		// Show all balloons.
		// Important: Notice polymorphism at work. The arraylist
		// is the type Shape but we only place child objects in it.
		File file = new File("Circus.txt");
		PrintWriter output = null; 
		try
		{
			output = new PrintWriter(file); // requires throws for FileNotFoundException
			for(Shape shape : balloons)
			{	
				//System.out.println(shape.toString());
				//System.out.println(shape.calculateArea());
				output.println(shape.toSave());
			}
		}
		catch(FileNotFoundException err)
		{
			System.out.println(err.getMessage());
		}
		output.close();
		
		//clear arraylist
		balloons.clear();
		
		//read file create above
		File file2 = new File("Circus.txt");
		try
		{
			Scanner input = new Scanner(file2);
			while(input.hasNext())
			{				
				String reader[] = input.nextLine().split(",");
				
				//System.out.println(reader);
				if(reader[0].equals("Circle"))
				{
					//String circle[] = reader.split(",");
					balloons.add(new Circle(reader[1], Double.parseDouble(reader[2]) ) );
				}
				else
				{
					//String rect[] = reader.split(",");
					balloons.add(new Rectangle(reader[1], Double.parseDouble(reader[2]), Double.parseDouble(reader[3])));
				}
			}
			input.close();
		}
		catch(IOException error)
		{
			System.out.println(error.getMessage());
		} catch (NumberFormatException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NegativeDoubleException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Shape shape:balloons)
		{
			System.out.println(shape);
		}
		
	}

}
