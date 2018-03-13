package chapter12;

public class Cylinder extends Circle implements Fillable, Paintable
{

	private double height;
	
	public Cylinder(String name, double radius, double height)
	{
		super(name, radius);
		this.height = height;
	}

	public Cylinder(Cylinder cylinder)
	{
		super(cylinder);
		this.height = cylinder.getHeight();
	}
	
	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	@Override
	public String toString()
	{
		return super.toString();
	}

	@Override
	public double getSurfaceArea()
	{
		
		return 0;
	}

	@Override
	public double getVolume()
	{
		
		return 0;
	}

	
}
