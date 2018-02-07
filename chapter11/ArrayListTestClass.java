package chapter11;

public class ArrayListTestClass
{
	private String name;

	public ArrayListTestClass(String name)
	{
		super();
		this.name = name;
	}
	
	public ArrayListTestClass(ArrayListTestClass altc)
	{
		this.name = altc.getName();
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "ArrayListTestClass [name=" + name + "]";
	}
	
}
