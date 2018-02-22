package chapter12;

import java.util.ArrayList;

public class Driver
{
	public static void main(String[] args)
	{
		//AbstractShape abstractShape = new AbstractShape("");
		
		ArrayList<AbstractShape> arr = new ArrayList<AbstractShape>();
		Cylinder cylinder = new Cylinder("Foo", 10, 5);
		Circle circle = new Circle("Bar", 12);
		arr.add(new Cylinder(cylinder));
		arr.add(new Circle(circle));
		
		circle.setName("Feyedoe");
		
		//AbstractShape shape1 = arr.get(0);
		//shape1.setName("Strange things are happening!");
		//System.out.println(shape1.getName());
		
		for(AbstractShape shape2 : arr)
		{
			System.out.println(shape2);
			System.out.println();
		}
	}
}
