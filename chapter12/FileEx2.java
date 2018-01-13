/**
 * -------------------------------------------------
 * File name: FileEx2.java
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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <b>File and PrintWriter example</b>
 * <hr>
 * Date created: Jan 12, 2018
 * <hr>
 * @author David Blair
 */
public class FileEx2
{

	/**
	 * Method description: Example of creating a new file and writing to it.
	 * Date: Jan 12, 2018
	 * @param args
	 * @return void
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) 
	{
		try
		{
			//open a new file and write two lines to it.
			//if file exists, it will be written over
			File file = new File("testFile.txt");
			PrintWriter output = new PrintWriter(file);
			output.print("John Doe,");
			output.println("90");
			output.print("Jill Hill,");
			output.println("80");
			
			output.close();
		}
		catch(IOException error)
		{
			System.out.println(error.getMessage());
		}
	}

}
