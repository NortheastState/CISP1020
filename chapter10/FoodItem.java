/**
 * -------------------------------------------------
 * File name: FoodItem.java
 * Project name: CISP1020
 * -------------------------------------------------
 * Creator's name: David Blair
 * Email: dlblair@northeaststate.edu
 * Course and section: CISP 1020 A01
 * Creation date: Jan 18, 2018
 * -------------------------------------------------
 */
package chapter10;

/**
 * <b>Enter purpose</b>
 * <hr>
 * Date created: Jan 18, 2018
 * <hr>
 * @author David Blair
 */
public class FoodItem
{
	//class attributes
	private String name;
	private double cost;
	
	public FoodItem(String name, double cost)
	{
		super();
		this.name = name;
		this.cost = cost;
	}
	
	public FoodItem(FoodItem foodItem)
	{
		this.name = foodItem.getName();
		this.cost = foodItem.getCost();
	}

	public String getName()
	{
		return name;
	}

	public double getCost()
	{
		return cost;
	}
	
	
}
