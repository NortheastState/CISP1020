package chapter12;

public class Shape extends AbstractShape
{
	public Shape(String name)
	{
		super(name);
	}
	
	public Shape(Shape shape)
	{
		super(shape);
	}

	@Override
	public String getName()
	{
		return super.name;
	}

	@Override
	public void setName(String name)
	{
		super.name = name;
	}

	@Override
	public String toString()
	{
		return this.name;
	}

}
