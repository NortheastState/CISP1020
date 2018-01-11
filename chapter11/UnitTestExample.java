package chapter11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UnitTestExample
{

	@BeforeAll
	static void setUpBeforeClass() throws Exception
	{
		System.out.println("in setUpBeforeClass");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception
	{
		System.out.println("in teardownAfterClass");
	}

	@BeforeEach
	void setUp() throws Exception
	{
		System.out.println("\nin setup");
	}

	@AfterEach
	void tearDown() throws Exception
	{
		System.out.println("in tearDown");
	}

	@Test
	@DisplayName("Check Numbers")
	void test1()
	{
		System.out.println("in test1");
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Test for output of bounds")
	void test2()
	{
		System.out.println("in test1");
		fail("Not yet implemented");
	}
	
	@Test
	@DisplayName("Check Values")
	void test3()
	{
		System.out.println("in test1");
		fail("Not yet implemented");
	}
}
