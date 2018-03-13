package chapter12;

public class Circle extends Shape
{

	private double radius;
	
	public Circle(String name, double radius)
	{
		super(name);
		this.radius = radius;
	}
	
	public Circle(Circle circle)
	{
		super(circle);
		this.radius = circle.getRadius();
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	@Override
	public String toString()
	{
		return super.toString();
	}

}
