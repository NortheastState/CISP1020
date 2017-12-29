package chapter11.shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestCircle
{

	private static Circle circle;
	private static Circle circleOverloaded;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception
	{
		circle = new Circle();
		circleOverloaded = new Circle("Overlaoded Constructor", 1.57);
	}

	@Test
	@DisplayName("Test default constructor")
	void testDefaultConstructor()
	{
		assertEquals(circle.getName(), "TBD");
		assertEquals(circle.getRadius(), 0.0);
		assertEquals(circle.calculateArea(), 0.0);
	}
	
	@Test
	@DisplayName("Test overloaded constructor")
	void testOverloadedConstructor()
	{
		System.out.print(circleOverloaded.getName());
		assertTrue(circleOverloaded.getName().equals("Overlaoded Constructor"));
		assertEquals(circleOverloaded.getRadius(), 1.57);
		assertEquals(circleOverloaded.calculateArea(), 7.743711731833481);
	}
	
	@Test
	@DisplayName("Test copy constructor")
	void testCopyConstructor()
	{
		Circle tempC = new Circle(circleOverloaded);
		tempC.setRadius(2.22);
		assertEquals(circleOverloaded.getRadius(), 1.57);
		assertFalse(tempC.equals(circleOverloaded));
	}

}
