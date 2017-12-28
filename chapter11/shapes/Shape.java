package chapter11.shapes;

public class Shape
{
	private String name;
	
	public Shape()
	{
		this.name = "TBD";
	}
	
	public Shape(String name)
	{
		this.name = name;
	}

	public Shape(Shape shape)
	{
		this.name = shape.getName();
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	//defining calculateArea here makes late binding possible 
	//bass class has not calculateArea method so no Override necessary
	public double calculateArea()
	{
		return 0.0;
	}
	
	//defined in base class, override here and in child
	@Override
	public String toString()
	{
		return "Shape Class: ";
	}
	
	//defined in base class, override here and in child
	@Override
	public boolean equals(Object o)
	{
		return false;	
	}
	
}
