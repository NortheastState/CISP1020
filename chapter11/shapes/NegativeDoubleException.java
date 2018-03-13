package chapter11.shapes;

public class NegativeDoubleException extends Exception
{
	private double negNumber;
	
	public NegativeDoubleException(String message, double negNumber)
	{
		super(message);
		this.negNumber = negNumber;
	}
	
	public double getNegNumber()
	{
		return negNumber;
	}
	
}
