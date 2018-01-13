/**
 * -------------------------------------------------
 * File name: NegativeNumberException.java
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
 * <b>Custom exception example</b>
 * <hr>
 * Date created: Jan 12, 2018
 * <hr>
 * @author David Blair
 */
public class NegativeNumberException extends Exception
{
	private int negInt;
	
	/**
	 * 
	 * Description: Default constructor
	 * Notice the call super(), this calls the base
	 * class default constructor.
	 * Date: Jan 12, 2018
	 */
	NegativeNumberException()
	{
		super();
		negInt = 0;
	}
	
	/**
	 * 
	 * Description: Overloaded constructor.
	 * The call up to super() sends the text that can be
	 * Retrieved through a call to getMessage() method.
	 * @param negInt
	 * Date: Jan 12, 2018
	 */
	NegativeNumberException(int negInt)
	{
		super("Negative number " + negInt);
		this.negInt = negInt;
	}

	/**
	 * 
	 * Method description: Return the integer value
	 * that caused the exception to be thrown.
	 * Date: Jan 12, 2018
	 * @return int
	 */
	public int getNegInt()
	{
		return negInt;
	}
	
	/**
	 * 
	 * Method description: Return the custom string.
	 * Date: Jan 12, 2018
	 * @return int
	 */
	@Override
	public String toString()
	{
		return "Negative number " + this.negInt + " not valid. It must be positive";
	}
	
	
}
