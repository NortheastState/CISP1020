/**
 * -------------------------------------------------
 * File name: ExceptionEx3.java
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
 * <b>Exception example</b>
 * <hr>
 * Date created: Jan 12, 2018
 * <hr>
 * @author David Blair
 */
public class ExceptionEx3
{
	/**
	 * 
	 * Method description: Entry point for the application 
	 * Date: Jan 12, 2018
	 * @param args
	 * @return void
	 */
	public static void main(String[] args)
	{
		//the catch allows you to more gracefully handle exceptions in code
		try
		{
			int anInt1 = 10;
			int anInt2 = 10;
			System.out.println(runDivision(anInt1, anInt2));
		}
		catch(ArithmeticException error)
		{
			System.out.println("Error: " + error.getMessage());
		}
		finally //finally is optional and will always execute, with or without an exception
		{
			System.out.println("Finally!");
		}
		
		try
		{
			System.out.println("6 + 3 is " + addTwoNumbers(6, 3));
		}
		catch(NegativeNumberException error)
		{
			System.out.println(error.getMessage());
		}
		
	}
	
	/**
	 * 
	 * Method description: Example for throwing an exception back to the
	 * calling location. 
	 * Date: Jan 12, 2018
	 * @param a
	 * @param b
	 * @return double
	 */
	public static double runDivision(int a, int b) throws ArithmeticException 
	{
		if(b == 0)
			throw new ArithmeticException("Divide by zero error");
		
		return (double)a/b;
	}
	
	/**
	 * 
	 * Method description: Silly example but you get the idea 
	 * Date: Jan 12, 2018
	 * @param a
	 * @param b
	 * 
	 * @throws NegativeNumberException
	 * @return int
	 */
	public static int addTwoNumbers(int a, int b) throws NegativeNumberException
	{
		if(a < 0)
			throw new NegativeNumberException(a);
		
		if(b < 0)
			throw new NegativeNumberException(b);
		
		return a + b;
	}
}
