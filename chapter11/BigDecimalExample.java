/**
 * -------------------------------------------------
 * File name: BigDecimalExample.java
 * Project name: CISP1020
 * -------------------------------------------------
 * Creator's name: David Blair
 * Email: dlblair@northeaststate.edu
 * Course and section: CISP 1020 A01
 * Creation date: Jan 16, 2018
 * -------------------------------------------------
 */
package chapter11;

import java.math.BigDecimal;

/**
 * <b>Example showing the precision issue using
 * 		a double for high precision work, such
 * 		as money calculations</b>
 * <hr>
 * Date created: Jan 16, 2018
 * <hr>
 * @author David Blair
 */
public class BigDecimalExample
{

	/**
	 * Method description: Driver to test using
	 * 		the BigDecimal class
	 * Date: Jan 16, 2018
	 * @param args
	 * @return void
	 */
	public static void main(String[] args)
	{
		//run a test adding .01 to a double
		//value, 1000 times. .01 * 10 = 0.10
		double lotsOfPennies = 0.00;
		for(int i = 0; i < 10; i++)
		{
			lotsOfPennies += 0.01;
			//System.out.println(lotsOfPennies);
		}
		
		System.out.println("Total: " + lotsOfPennies);
		//=================================
		
		//now run the same test using the BigDecimal class
		BigDecimal bigD1 = new BigDecimal("0.00");
		BigDecimal bigD2 = new BigDecimal("0.01");
		for(int i = 0; i < 10; i++)
		{
			bigD1 = bigD1.add(bigD2);
			//System.out.println(bigD1.toString());
		}
		
		System.out.println("Total: " + bigD1.toString());
		//=================================

	}

}
