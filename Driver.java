import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Driver
{

	public static void main(String[] args)
	{
		ArrayList<Employee> emps = new ArrayList<>();
		ArrayList<Dependent> dependents = new ArrayList<Dependent>();
		dependents.add(new Dependent("Foobar", 13));
		dependents.add(new Dependent("Barfoo", 15));
		emps.add(new Employee("Dave", "100 Street", "Zoom", "ZM", 12345, dependents));
		
		writeToBinaryFile(emps);
		ArrayList<Employee> emps2 = readFromBinaryFile();
		System.out.println(emps2);
	}
	
	public static ArrayList<Employee> readFromBinaryFile()
	{
		ArrayList<Employee> emps = new ArrayList<Employee>();
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.dat")))
		{
			emps = (ArrayList<Employee>)(ois.readObject());
			
		}catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emps;
	}
	
	public static void writeToBinaryFile(ArrayList<Employee> emps)
	{
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat")))
		{
			oos.writeObject(emps);
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
