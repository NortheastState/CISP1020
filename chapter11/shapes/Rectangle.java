package chapter11.shapes;

public class Rectangle extends Shape
{
	private double length;
	private double width;

	public Rectangle()
	{
		super();
		this.length = 0.0;
		this.width = 0.0;
	}

	public Rectangle(String name, double length, double width)
	{
		super(name);
		this.length = length;
		this.width = width;
	}

	public double getLength()
	{
		return length;
	}

	public void setLength(double length)
	{
		this.length = length;
	}

	public double getWidth()
	{
		return width;
	}

	public void setWidth(double width)
	{
		this.width = width;
	}

	//annotation helps prevent mistakes and requires the method to be exactly like the base class method
	@Override
	public double calculateArea()
	{
		return this.length * this.width;
	}

	//annotation helps prevent mistakes and requires the method to be exactly like the base class method
	@Override
	public String toString()
	{
		return "Length: " + Double.toString(length) + " Width: " + Double.toString(width);
	}

	//annotation helps prevent mistakes and requires the method to be exactly like the base class method
	@Override
	public boolean equals(Object o)
	{
		if(!(o instanceof Rectangle))
			return false;
		
		if (((Rectangle) o).length == this.length && ((Rectangle) o).width == this.width)
			return true;
		else
			return false;
	}
	
}
