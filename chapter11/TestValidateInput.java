package chapter11;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestValidateInput
{

	static Utilities Util;
	
	@BeforeAll
	static void initAll()
	{
		Util = new Utilities();
	}
	
	@Test
	@DisplayName("Test for valid numbers")
	void testValidFloat()
	{
		assertTrue(Util.isAValidFloat("-1.33"));
		assertEquals(Util.isAValidFloat("0.1"), true);
		assertEquals(Util.isAValidFloat("0.0"), true);
		assertEquals(Util.isAValidFloat("-0"), true);
		assertEquals(Util.isAValidFloat("-0.1"), true);
		assertEquals(Util.isAValidFloat(".01"), true);
	}

	@Test
	@DisplayName("Test for invalid numbers")
	void testInvalidFloat()
	{
		assertFalse(Util.isAValidFloat(null));
		assertFalse(Util.isAValidFloat("15.3.3"));
		assertFalse(Util.isAValidFloat("15..33"));
		assertEquals(Util.isAValidFloat("15 3"), false);
		assertEquals(Util.isAValidFloat("-00-3"), false);
		assertEquals(Util.isAValidFloat("--003"), false);
	}
	
	@Test
	@DisplayName("Test for valid Integer")
	void testValidInteger()
	{
		assertTrue(Util.isAValidInteger("-1"));
		assertEquals(Util.isAValidInteger("0"), true);
		assertEquals(Util.isAValidInteger("00"), true);
		assertEquals(Util.isAValidInteger("42"), true);
		assertEquals(Util.isAValidInteger("-0000"), true);
		assertEquals(Util.isAValidInteger(""), true);
	}

	@Test
	@DisplayName("Test for invalid Integer")
	void testInvalidInteger()
	{
		assertFalse(Util.isAValidInteger(null));
		assertFalse(Util.isAValidInteger("15 3"));
		assertFalse(Util.isAValidInteger("00.33"));
		assertEquals(Util.isAValidInteger("15-3"), false);
		assertEquals(Util.isAValidInteger("-00-3"), false);
	}
	
	
}
