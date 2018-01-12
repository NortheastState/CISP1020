/**
 * -------------------------------------------------
 * File name: TestCircle.java
 * Project name: CISP1020
 * -------------------------------------------------
 * Creator's name: David Blair
 * Email: dlblair@northeaststate.edu
 * Course and section: CISP 1020 A01
 * Creation date: Jan 11, 2018
 * -------------------------------------------------
 */
package chapter11.shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 
 * <b>[Enter purpose here]</b>
 * <hr>
 * Date created: Jan 12, 2018
 * <hr>
 * @author David Blair
 */
class TestCircle
{

	// class attributes
	private static Circle circle;
	private static Circle circleOverloaded;
	
	/**
	 * 
	 * Method description: constructor
	 * Date: Jan 12, 2018
	 * @throws Exception
	 * @return void
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception
	{
		circle = new Circle();
		circleOverloaded = new Circle("Overlaoded Constructor", 1.57);
	}

	/**
	 * 
	 * Method description: Unit test for default constructor
	 * Date: Jan 12, 2018
	 * @return void
	 */
	@Test
	@DisplayName("Test default constructor")
	void testDefaultConstructor()
	{
		assertEquals(circle.getName(), "TBD");
		assertEquals(circle.getRadius(), 0.0);
		assertEquals(circle.calculateArea(), 0.0);
	}
	
	/**
	 * 
	 * Method description: unit test for overloaded circle constructor
	 * Date: Jan 12, 2018
	 * @return void
	 */
	@Test
	@DisplayName("Test overloaded constructor")
	void testOverloadedConstructor()
	{
		System.out.print(circleOverloaded.getName());
		assertTrue(circleOverloaded.getName().equals("Overlaoded Constructor"));
		assertEquals(circleOverloaded.getRadius(), 1.57);
		assertEquals(circleOverloaded.calculateArea(), 7.743711731833481);
	}
	
	/**
	 * 
	 * Method description: test case for circle copy constructor
	 * Date: Jan 12, 2018
	 * @return void
	 */
	@Test
	@DisplayName("Test copy constructor")
	void testCopyConstructor()
	{
		Circle tempC = new Circle(circleOverloaded);
		tempC.setRadius(2.22);
		assertEquals(circleOverloaded.getRadius(), 1.57);
		assertFalse(tempC.equals(circleOverloaded));
	}
	
	//finish all circle tests below
	//-----------------------------

}
