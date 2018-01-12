/**
 * -------------------------------------------------
 * File name: ExceptionEx1.java
 * Project name: CISP1020
 * -------------------------------------------------
 * Creator's name: David Blair
 * Email: dlblair@northeaststate.edu
 * Course and section: CISP 1020 A01
 * Creation date: Jan 12, 2018
 * -------------------------------------------------
 */
package chapter12;

/**
 * <b>What is an exception and how is on thrown and caught?</b>
 * <hr>
 * Date created: Jan 12, 2018
 * <hr>
 * @author David Blair
 */
public class ExceptionEx1
{

	/**
	 * Method description: Entry point for all Java programs
	 * Date: Jan 12, 2018
	 * @param args
	 * @return void
	 */
	public static void main(String[] args)
	{
		//An exception is a condition that prevents normal execution.
		//For example, dividing any number by 0 is said to be undefined.
		//So what happens in a computer program when a division by zero happens?
		int anInt1 = 10;
		int anInt2 = 0;
		System.out.println("results: " + anInt1 / anInt2);
		
		//Clearly this code will produce an "ArithmeticException" error.
		//Run this code and see what happens
		
		//We will see how to handle exceptions in Ex. 2
	}

}
