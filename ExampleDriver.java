package edu.northeast.blairdev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

public class ExampleDriver
{
	public static void main(String[] args) throws InterruptedException
	{
		Queue<String> grades1 = new LinkedList<>();
		grades1.add("88");
		grades1.add("90");
		grades1.add("64");
		grades1.add("91");
		grades1.add("56");
		
		TimerTask task1 = new ExampleTask(grades1);
		Timer timer1 = new Timer();
		timer1.schedule(task1, 1000, 5000);
		
		
		while(grades1.size() > 0)
		{
			Thread.sleep(1000);
			System.out.println("foobar");
		}
		
		task1.cancel();
		timer1.cancel();
		timer1.purge();
		
		System.out.println("Done");
		
	}
}
