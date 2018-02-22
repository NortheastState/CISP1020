package chapter12;

public abstract class AbstractShape
{
	protected String name;

	public AbstractShape(String name)
	{
		super();
		this.name = name;
	}
	
	public AbstractShape(AbstractShape shape)
	{
		this.name = shape.name;
	}
	
	abstract public String getName();
	abstract public void setName(String name);
	abstract public String toString();
	
}
