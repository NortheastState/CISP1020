/**
 * -------------------------------------------------
 * File name: FileEx3.java
 * Project name: CISP1020
 * -------------------------------------------------
 * Creator's name: David Blair
 * Email: dlblair@northeaststate.edu
 * Course and section: CISP 1020 A01
 * Creation date: Jan 12, 2018
 * -------------------------------------------------
 */
package chapter12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <b>Example using try-with-resources to 
 * 		automatically close open resources</b>
 * <hr>
 * Date created: Jan 12, 2018
 * <hr>
 * @author David Blair
 */
public class FileEx3
{

	/**
	 * Method description: Java entry point
	 * Date: Jan 12, 2018
	 * @param args
	 * @return void
	 */
	public static void main(String[] args)
	{
		File file = new File("testFile.txt");
		try(PrintWriter output = new PrintWriter(file))
		{
			output.print("Foo Bar,");
			output.println("180");
			output.print("Bar Foo,");
			output.println("-180");
			
			//output.close(); //no need for close code
		}
		catch(IOException error)
		{
			System.out.println(error.getMessage());
		}
	}

}
