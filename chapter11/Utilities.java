/**
 * -------------------------------------------------
 * File name: Utilities.java
 * Project name: CISP1020
 * -------------------------------------------------
 * Creator's name: David Blair
 * Email: dlblair@northeaststate.edu
 * Course and section: CISP 1020 A01
 * Creation date: Jan 11, 2018
 * -------------------------------------------------
 */
package chapter11;

/**
 * 
 * <b>This class can be used to test the input for either
 * an Integer or a floating point value.</b>
 * <hr>
 * Date created: Jan 11, 2018
 * <hr>
 * @author David Blair
 */
public class Utilities
{
	/**
	 * 
	 * Method description: This method tests the input
	 * value (parameter value) to see if it is a valid
	 * floating point. It returns true if it is and false
	 * if it isn't.
	 * 
	 * Date: Jan 11, 2018
	 * @param value
	 * @return boolean
	 */
	public boolean isAValidFloat(String value)
	{
		//check to see if a none-initialized parameter
		//is passed in value
		if (value == null)
		{
			return false;
		}

		//find the length of the string so it can
		//be parsed one letter at a time
		int stringLength = value.length();
		boolean isCharANumber = true;
		int periodCounter = 0;
		int minusSignCounter = 0;

		for (int i = 0; i < stringLength; i++)
		{
			//get next character from string array
			char charDigit = value.charAt(i);
			//cast to integer which is ascii code
			int intDigit = (int) charDigit;
			//check range is not an ascii number
			if (intDigit < 48 || intDigit > 57)
			{
				//is ascii decimal point?
				//is so, add up how many?
				//one if fine
				if (intDigit == 46)
				{
					periodCounter++;
				} //check if hyphen
				else if (intDigit == 45)
				{
					minusSignCounter = i;
				}//is a space? None allowed 
				else if (intDigit == 32)
				{
					isCharANumber = false;
					break;
				} else
				{
					isCharANumber = false;
					break;
				}
			}

		}

		//if more than one decimal point, not a valid float
		if (periodCounter > 1)
			isCharANumber = false;

		//if a minus sign not the first position in the string, not valid
		if (minusSignCounter != 0)
			isCharANumber = false;

		return isCharANumber;
	}

	/**
	 * 
	 * Method description: This method tests the input
	 * value (parameter value) to see if it is a valid
	 * integer. It returns true if it is and false
	 * if it isn't.
	 * Date: Jan 11, 2018
	 * @param value
	 * @return boolean
	 */
	public boolean isAValidInteger(String value)
	{
		//check to see if a none-initialized parameter
		//is passed in value
		if (value == null)
		{
			return false;
		}

		//find the length of the string so it can
		//be parsed one letter at a time
		int stringLength = value.length();
		boolean isCharANumber = true;
		int minusSignCounter = 0;

		for (int i = 0; i < stringLength; i++)
		{
			//get next character from string array
			char charDigit = value.charAt(i);
			//cast the character to an ascii digit
			int intDigit = (int) charDigit;
			//is out of range of integer in the ascii table
			if (intDigit < 48 || intDigit > 57)
			{
				//get last location of the minus sign
				if (intDigit == 45)
				{
					minusSignCounter = i;
				}//is a space? 
				else if (intDigit == 32)
				{
					isCharANumber = false;
					break;
				} //is something totally unexpected
				else
				{
					isCharANumber = false;
					break;
				}
			}

		}

		//if minus sign location other than first spot in string, error
		if (minusSignCounter > 0)
			isCharANumber = false;

		return isCharANumber;
	}
}
