/**
 * -------------------------------------------------
 * File name: TestRectangle.java
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
import org.junit.jupiter.api.Test;

/**
 * 
 * <b>[Enter purpose here]</b>
 * <hr>
 * Date created: Jan 12, 2018
 * <hr>
 * @author David Blair
 */
class TestRectangle
{
	
	// class attributes
	private static Rectangle rectangle;
	private static Rectangle rectangleOverloaded;
	
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
		rectangle = new Rectangle();
		rectangleOverloaded = new Rectangle("rectangle", 5.1, 4.8);
	}

	//complete all unit tests for rectangle
	//-------------------------------------
	
}
