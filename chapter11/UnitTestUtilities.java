/**
 * -------------------------------------------------
 * File name: UnitTestUtilities.java
 * Project name: CISP1020
 * -------------------------------------------------
 * Creator's name: David Blair
 * Email: dlblair@northeaststate.edu
 * Course and section: CISP 1020 A01
 * Creation date: Jan 11, 2018
 * -------------------------------------------------
 */
package chapter11;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 
 * <b>Unit test for Utilities.java class. Should use
 * for regression testing.</b>
 * <hr>
 * Date created: Jan 11, 2018
 * <hr>
 * @author David Blair
 */
class UnitTestUtilities
{

	private Utilities Util;
	
	/**
	 * 
	 * Method description: initialize object to me tested
	 * Date: Jan 11, 2018
	 * @return void
	 */
	@BeforeAll
	public void initAll()
	{
		Util = new Utilities();
	}
	
	/**
	 * 
	 * Method description: test Util object using valid floating point numbers
	 * Date: Jan 11, 2018
	 * @return void
	 */
	@Test
	@DisplayName("Test for valid numbers")
	public void testValidFloat()
	{
		assertTrue(Util.isAValidFloat("-1.33"));
		assertEquals(Util.isAValidFloat("0.1"), true);
		assertEquals(Util.isAValidFloat("0.0"), true);
		assertEquals(Util.isAValidFloat("-0"), true);
		assertEquals(Util.isAValidFloat("-0.1"), true);
		assertEquals(Util.isAValidFloat(".01"), true);
	}

	/**
	 * 
	 * Method description: test Util object using NOT valid floating point numbers
	 * Date: Jan 11, 2018
	 * @return void
	 */
	@Test
	@DisplayName("Test for invalid numbers")
	public void testInvalidFloat()
	{
		assertFalse(Util.isAValidFloat(null));
		assertFalse(Util.isAValidFloat("15.3.3"));
		assertFalse(Util.isAValidFloat("15..33"));
		assertEquals(Util.isAValidFloat("15 3"), false);
		assertEquals(Util.isAValidFloat("-00-3"), false);
		assertEquals(Util.isAValidFloat("--003"), false);
	}
	
	/**
	 * 
	 * Method description: Test Util for valid integers
	 * Date: Jan 11, 2018
	 * @return void
	 */
	@Test
	@DisplayName("Test for valid Integer")
	public void testValidInteger()
	{
		assertTrue(Util.isAValidInteger("-1"));
		assertEquals(Util.isAValidInteger("0"), true);
		assertEquals(Util.isAValidInteger("00"), true);
		assertEquals(Util.isAValidInteger("42"), true);
		assertEquals(Util.isAValidInteger("-0000"), true);
		assertEquals(Util.isAValidInteger(""), true);
	}

	/**
	 * 
	 * Method description: Test Util for NOT valid integers
	 * Date: Jan 11, 2018
	 * @return void
	 */
	@Test
	@DisplayName("Test for invalid Integer")
	public void testInvalidInteger()
	{
		assertFalse(Util.isAValidInteger(null));
		assertFalse(Util.isAValidInteger("15 3"));
		assertFalse(Util.isAValidInteger("00.33"));
		assertEquals(Util.isAValidInteger("15-3"), false);
		assertEquals(Util.isAValidInteger("-00-3"), false);
	}
	
	
}
