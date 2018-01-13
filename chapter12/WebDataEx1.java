/**
 * -------------------------------------------------
 * File name: WebDataEx1.java
 * Project name: CISP1020
 * -------------------------------------------------
 * Creator's name: David Blair
 * Email: dlblair@northeaststate.edu
 * Course and section: CISP 1020 A01
 * Creation date: Jan 13, 2018
 * -------------------------------------------------
 */
package chapter12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * <b>Accessing files on the Internet</b>
 * <hr>
 * Date created: Jan 13, 2018
 * <hr>
 * @author David Blair
 */
public class WebDataEx1
{

	/**
	 * Method description: Java application entry point
	 * Date: Jan 13, 2018
	 * @param args
	 * @return void
	 */
	public static void main(String[] args)
	{
	
		//Use Java's URL class to open an URL from the Web.
		//A bad or malformed URL will throw an exception. 
		try
		{
			URL url = new URL("https://www.wunderground.com/history/airport/KVJI/2016/1/13/DailyHistory.html?req_city=Bristol&req_state=TN&req_statename=Tennessee&reqdb.zip=37620");
			Scanner input = new Scanner(url.openStream());			
			while(input.hasNext())
			{
				System.out.println(input.nextLine());
			}
			input.close();
		}
		catch(MalformedURLException err)
		{
			System.out.println("Malformed URL: " + err.getMessage());
		}
		catch(IOException err)
		{
			System.out.println("IO Exception: " + err.getMessage());
		}
		catch(Exception err)
		{
			System.out.println("Exception: " + err.getMessage());
		}

	}

}
