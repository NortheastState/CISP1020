/**
 * -------------------------------------------------
 * File name: FileEx4.java
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
import java.util.Scanner;

/**
 * <b>Example using the Scanner object to read/write to a file</b>
 * <hr>
 * Date created: Jan 12, 2018
 * <hr>
 * @author David Blair
 */
public class FileEx4
{

	/**
	 * Method description: Entry point for Java
	 * Date: Jan 12, 2018
	 * @param args
	 * @return void
	 */
	public static void main(String[] args)
	{
		File file = new File("testFile.txt");
		//this time read in info from the text file using the 
		//Scanner object.
		try(Scanner input = new Scanner(file))
		{
			while(input.hasNext())
			{				
				System.out.println(input.nextLine());
			}
		}
		catch(IOException error)
		{
			System.out.println(error.getMessage());
		}
	}

}
