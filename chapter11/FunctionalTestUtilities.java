/**
 * -------------------------------------------------
 * File name: FunctionalTestValidateInput.java
 * Project name: CISP1020
 * -------------------------------------------------
 * Creator's name: David Blair
 * Email: dlblair@northeaststate.edu
 * Course and section: CISP 1020 A01
 * Creation date: Jan 11, 2018
 * -------------------------------------------------
 */
package chapter11;

import java.util.Scanner;

/**
 * 
 * <b>The class is used to provide functional tests
 * for the Utilities.java object.</b>
 * <hr>
 * Date created: Jan 11, 2018
 * <hr>
 * @author David Blair
 */
public class FunctionalTestUtilities
{

	/**
	 * 
	 * Method description: main method is the entry
	 * point for java application from the command line
	 * Date: Jan 11, 2018
	 * @param args
	 * @return void
	 */
	public static void main(String[] args)
	{
		//declare local variables
		Scanner cin = new Scanner(System.in);
		String testIntegerString;
		String testDoubleString;
		Utilities Util = new Utilities();
		String stop = "";
		
		//get test input from user
		System.out.print("Enter a valid floating point number: ");
		testDoubleString = cin.nextLine();
		System.out.print("Enter a valid integer value: ");
		testIntegerString = cin.nextLine();
		
		//loop until the user enters a "q" or a "Q"
		while(true)
		{
			//test for valid input
			if (Util.isAValidFloat(testDoubleString))
				System.out.println("Floating point value entered " + testDoubleString + " is valid");
			else
				System.out.println("Floating point value entered " + testDoubleString + " is NOT valid");
			
			if (Util.isAValidFloat(testIntegerString))
				System.out.println("Integer value entered " + testIntegerString + " is valid");
			else
				System.out.println("Integer value entered " + testIntegerString + " is NOT valid");
			
			System.out.println("(Q)uit? (C)ontinue");
			stop = cin.nextLine();
			if (stop.equals("Q") || stop.equals("q"))
				break;
			
			//get test input from user
			System.out.print("Enter a valid floating point number: ");
			testDoubleString = cin.nextLine();
			System.out.print("Enter a valid integer value: ");
			testIntegerString = cin.nextLine();
		}
		
		System.out.println("Bye!");
	}

}
