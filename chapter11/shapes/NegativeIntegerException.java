package chapter11.shapes;

public class NegativeIntegerException extends Exception
{

	private int negNumber;

	public NegativeIntegerException(String message, int negNumber)
	{
		super(message);
		this.negNumber = negNumber;
	}
	
	public int getNegNumber()
	{
		return negNumber;
	}
	
}
