package chapter11;

import java.util.ArrayList;

public class ArrayListExample
{

	public static void main(String[] args)
	{
		//create array
		ArrayList<String> names = new ArrayList<String>();
		
		//add some strings
		names.add("Foo");
		names.add("Bar");
		names.add("Joe");
		names.add("Jane");
		
		//print array
		System.out.println("Print contents of the ArrayList:");
		for( String name : names )
		{
			System.out.println(name);
		}
		
		//find one of the entries and remove that entry
		//lets find "Joe"
		for( String name : names )
		{
			if(name.equals("Joe"))
			{
				names.remove(name);
				break; //once found, break out of loop or risk an exception
			}
		}
		
		//print array
		System.out.println("\nPrint the ArrayList contents after removing an object:");
		for( String name : names )
		{
			System.out.println(name);
		}

	}

}
