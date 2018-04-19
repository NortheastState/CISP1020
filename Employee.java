import java.io.Serializable;
import java.util.ArrayList;

public class Employee implements Serializable
{
	private String name;
	private String address;
	private String city;
	private String state;
	private int zip;
	private ArrayList<Dependent> dependents = new ArrayList<Dependent>();
	public Employee(String name, String address, String city, String state, int zip, ArrayList<Dependent> dependents)
	{
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.dependents = dependents;
	}
	public Employee()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getState()
	{
		return state;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public int getZip()
	{
		return zip;
	}
	public void setZip(int zip)
	{
		this.zip = zip;
	}
	public ArrayList<Dependent> getDependents()
	{
		return dependents;
	}
	public void setDependents(ArrayList<Dependent> dependents)
	{
		this.dependents = dependents;
	}
	@Override
	public String toString()
	{
		return "Employee [name=" + name + ", address=" + address + ", city=" + city + ", state=" + state + ", zip="
				+ zip + ", dependents=" + dependents + "]";
	}
	
}
