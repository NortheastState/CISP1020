package chapter11.shapes;

public class Circle extends Shape
{
	private double radius;
	
	public Circle()
	{
		super();
		this.radius = 0.0;
	}
	
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
	
	//annotation helps prevent mistakes and requires the method to be exactly like the base class method
	@Override
	public double calculateArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}

	//annotation helps prevent mistakes and requires the method to be exactly like the base class method
	@Override
	public String toString()
	{
		return "Radius: " + Double.toString(radius);
	}
	
	//annotation helps prevent mistakes and requires the method to be exactly like the base class method
	@Override
	public boolean equals(Object o)
	{		
		if (!(o instanceof Circle)) {
            return false;
        }
			
		double rad = ((Circle)o).getRadius();
		if ( rad == this.radius )
			return true;
		else
			return false;
	}
	
	
}
