package chapter11.shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestCircle
{

	private static Circle circle;
	private static Circle circleOverlaoded;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception
	{
		circle = new Circle();
		circleOverlaoded = new Circle("Overlaoded Constructor", 1.57);
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
		assertTrue(circleOverlaoded.getName().equals("Test overloaded constructor"));
		assertTrue(circleOverlaoded.getRadius() == 1.57);
		assertEquals(circleOverlaoded.calculateArea(), 1.23);
	}
	
	@Test
	@DisplayName("Test copy constructor")
	void testCopyConstructor()
	{
		//to do
	}

}
