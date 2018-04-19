package edu.northeast.blairdev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TimerTask;

public class ExampleTask extends TimerTask
{
	Queue<String> grades = new LinkedList<>();
	
	public ExampleTask(Queue<String> grades)
	{
		super();
		this.grades = grades;
	}

	@Override
	public void run()
	{
		if(grades.size() > 0)
			System.out.println(grades.remove());
		System.out.println("Running");
	}

}
