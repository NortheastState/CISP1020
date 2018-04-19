import java.io.Serializable;

public class Dependent implements Serializable
{
	private String name;
	private int age;
	public Dependent()
	{
		super();
	}
	public Dependent(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	@Override
	public String toString()
	{
		return "Dependent [name=" + name + ", age=" + age + "]";
	}
	
	
}
