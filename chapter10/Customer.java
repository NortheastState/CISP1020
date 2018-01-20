/**
 * -------------------------------------------------
 * File name: Customer.java
 * Project name: CISP1020
 * -------------------------------------------------
 * Creator's name: David Blair
 * Email: dlblair@northeaststate.edu
 * Course and section: CISP 1020 A01
 * Creation date: Jan 18, 2018
 * -------------------------------------------------
 */
package chapter10;

import java.util.ArrayList;

/**
 * <b>Customer class</b>
 * <hr>
 * Date created: Jan 18, 2018
 * <hr>
 * @author David Blair
 */
public class Customer
{
	String fullName;
	ArrayList<FoodItem> foodItems = new ArrayList<FoodItem>();
	
	public Customer(String firstName)
	{
		this.fullName = firstName;
	}
	
	public Customer(Customer customer)
	{
		this.fullName = customer.fullName;
		for(FoodItem foodItem : customer.foodItems)
		{
			foodItems.add(foodItem);
		}
	}

	public String getFullName()
	{
		return fullName;
	}

	public ArrayList<FoodItem> getFoodItems()
	{
		return foodItems;
	}
	
	public double calculateBill()
	{
		double totalBill = 0.0;
		for(FoodItem foodItem : foodItems)
		{
			totalBill += foodItem.getCost();
		}
		return totalBill;
	}
}
