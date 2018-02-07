package chapter11;

import java.util.ArrayList;

public class ArrayListExample2
{

	public static void main(String[] args)
	{
		ArrayList<ArrayListTestClass> altcs = new ArrayList<>();
		
		ArrayListTestClass altc1 = new ArrayListTestClass("Foo");
		ArrayListTestClass altc2 = new ArrayListTestClass("Bar");
		ArrayListTestClass altc3 = new ArrayListTestClass("Yin");
		ArrayListTestClass altc4 = new ArrayListTestClass("Yang");
		
		altcs.add(altc1);
		altcs.add(altc2);
		altcs.add(altc3);
		altcs.add(altc4);
		
		for(ArrayListTestClass altc : altcs)
		{
			System.out.println(altc);
		}
		
		for(ArrayListTestClass altc : altcs)
		{
			if(altc.getName().equals("Bar"))
			{
				altcs.remove(altc);
			}
		}
		
		System.out.println("");
		for(ArrayListTestClass altc : altcs)
		{
			System.out.println(altc);
		}
		
	}

}
