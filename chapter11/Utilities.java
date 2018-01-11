/**
 * 
 */
package chapter11;

/**
 * 
 * @author dave
 *
 */
public class Utilities
{
	/**
	 * 
	 * @param value
	 * @return
	 */
	public boolean isAValidFloat(String value)
	{
		if (value == null)
		{
			return false;
		}

		int stringLength = value.length();
		boolean isCharANumber = true;
		int periodCounter = 0;
		int minusSignCounter = 0;

		for (int i = 0; i < stringLength; i++)
		{
			char charDigit = value.charAt(i);
			int intDigit = (int) charDigit;
			if (intDigit < 48 || intDigit > 57)
			{
				if (intDigit == 46)
				{
					periodCounter++;
				} else if (intDigit == 45)
				{
					minusSignCounter = i;
				} else if (intDigit == 32)
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

		if (periodCounter > 1)
			isCharANumber = false;

		if (minusSignCounter > 0)
			isCharANumber = false;

		return isCharANumber;
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public boolean isAValidInteger(String value)
	{
		if (value == null)
		{
			return false;
		}

		int stringLength = value.length();
		boolean isCharANumber = true;
		int minusSignCounter = 0;

		for (int i = 0; i < stringLength; i++)
		{
			char charDigit = value.charAt(i);
			int intDigit = (int) charDigit;
			if (intDigit < 48 || intDigit > 57)
			{
				if (intDigit == 45)
				{
					minusSignCounter = i;
				} else if (intDigit == 32)
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

		if (minusSignCounter > 0)
			isCharANumber = false;

		return isCharANumber;
	}
}
