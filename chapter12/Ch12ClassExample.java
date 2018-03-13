package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ch12ClassExample
{

	public static void main(String[] args)
	{
		File file = new File("testFile.txt");
		try
		{
			Scanner input = new Scanner(file);
			while(input.hasNext())
			{				
				System.out.println(input.nextLine());
			}

			
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
