/**
 * -------------------------------------------------
 * File name: UnitTestExample.java
 * Project name: CISP1020
 * -------------------------------------------------
 * Creator's name: David Blair
 * Email: dlblair@northeaststate.edu
 * Course and section: CISP 1020 A01
 * Creation date: Jan 11, 2018
 * -------------------------------------------------
 */
package chapter11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 
 * <b>[Enter purpose here]</b>
 * <hr>
 * Date created: Jan 11, 2018
 * <hr>
 * @author David Blair
 */
class UnitTestExample
{
	/**
	 * 
	 * Method description: This method is similar to a
	 * constructor that is called first and only once
	 * Date: Jan 11, 2018
	 * @throws Exception
	 * @return void
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception
	{
		System.out.println("in setUpBeforeClass");
	}

	/**
	 * 
	 * Method description: This method is similar to a 
	 * destructor that is call once when a class has run
	 * out of references and is disposed.
	 * Date: Jan 11, 2018
	 * @throws Exception
	 * @return void
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception
	{
		System.out.println("in teardownAfterClass");
	}

	/**
	 * 
	 * Method description: Is executed before each test. 
	 * Date: Jan 11, 2018
	 * @throws Exception
	 * @return void
	 */
	@BeforeEach
	void setUp() throws Exception
	{
		System.out.println("\nin setup");
	}

	/**
	 * 
	 * Method description: Is executed after each test.
	 * Date: Jan 11, 2018
	 * @throws Exception
	 * @return void
	 */
	@AfterEach
	void tearDown() throws Exception
	{
		System.out.println("in tearDown");
	}

	/**
	 * 
	 * Method description: Example of a test
	 * Date: Jan 11, 2018
	 * @return void
	 */
	@Test
	@DisplayName("Test one display name")
	void test1()
	{
		System.out.println("in test1");
		fail("Not yet implemented");
	}

	/**
	 * 
	 * Method description: Execute test 2
	 * Date: Jan 11, 2018
	 * @return void
	 */
	@Test
	@DisplayName("Test two display name")
	void test2()
	{
		System.out.println("in test2");
		fail("Not yet implemented");
	}
	
	/**
	 * 
	 * Method description: Another test hooray
	 * Date: Jan 11, 2018
	 * @return void
	 */
	@Test
	@DisplayName("Test three display name")
	void test3()
	{
		System.out.println("in test3");
		fail("Not yet implemented");
	}
}
