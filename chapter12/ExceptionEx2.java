/**
 * -------------------------------------------------
 * File name: ExceptionEx2.java
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
 * <b>[Enter purpose here]</b>
 * <hr>
 * Date created: Jan 12, 2018
 * <hr>
 * @author David Blair
 */
public class ExceptionEx2
{

	/**
	 * Method description: Handling Excpetions
	 * Date: Jan 12, 2018
	 * @param args
	 * @return void
	 */
	public static void main(String[] args)
	{
		try
		{
			int anInt1 = 10;
			int anInt2 = 0;
			System.out.println("results: " + anInt1 / anInt2);
		}
		catch(ArithmeticException error)
		{
			System.out.println(error.getMessage());
		}
		catch(Exception error)
		{
			System.out.println(error.getMessage());
		}
		

	}

}
