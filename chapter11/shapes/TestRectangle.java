package chapter11.shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestRectangle
{
	
	private static Rectangle rectangle;
	private static Rectangle rectangleOverloaded;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception
	{
		rectangle = new Rectangle();
		rectangleOverloaded = new Rectangle("rectangle", 5.1, 4.8);
	}

	@Test
	void test()
	{
		
	}

}
