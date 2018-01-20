/**
 * -------------------------------------------------
 * File name: FOODDriver.java
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
import java.util.Scanner;
import chapter11.Utilities;

/**
 * <b>Enter purpose</b>
 * <hr>
 * Date created: Jan 18, 2018
 * <hr>
 * @author David Blair
 */
public class FOODDriver
{

	private static ArrayList<Table> tables = new ArrayList<Table>();
	
	/**
	 * Method description: 
	 * Date: Jan 18, 2018
	 * @param args
	 * @return void
	 */
	public static void main(String[] args)
	{
		Utilities Util = new Utilities();
		Scanner cin = new Scanner(System.in);
		boolean done = false;
		String selection = "";
		
		tables.add(new Table(1));
		tables.add(new Table(2));
		tables.add(new Table(3));
		
		while(!done)
		{
			int intSelection = 0;
			System.out.print("Select a table to serve: 1, 2, or 3 OR (E)xit: ");
			selection = cin.nextLine();
			if(Util.isAValidInteger(selection))
			{
				intSelection = Integer.parseInt(selection);
			}
			else
			{
				if(selection.equals("E") || selection.equals("e"))
				{
					done = true;
					continue;
				}
				System.out.println("\nYou must enter a valid integer\n");
				continue;
			}
			
			if(intSelection < 0 || intSelection > 3)
			{
				System.out.println("\nYou must enter a number between 1 and 3\n");
				continue;
			}
			
			while(true)
			{
				boolean customersPresent = false;
				//System.out.println("Customers at this table " + intSelection + ": ");
				for(Customer customer : tables.get(intSelection - 1).getCustomers())
				{
					//System.out.println(customer.getFullName());
					customersPresent = true;
				}
				
				if(customersPresent)
				{
					System.out.print("(A)dd new customer, (F)ood for a customer, (V)iew bill, OR (D)one: ");
				}
				else
				{
					System.out.print("(A)dd a customer OR (D)one: ");
				}
				
				String name = cin.nextLine();
				
				if(name.equals("D") || name.equals("d"))
					break;
				
				if(name.equals("V") || name.equals("v"))
				{
					System.out.println("Total table expense: $" + tables.get(intSelection - 1).calculateTableBill());
					for(Customer tableCustomer : tables.get(intSelection - 1).getCustomers())
					{
						System.out.println("Customer: " + tableCustomer.getFullName() + " - $" + tableCustomer.calculateBill());
					}
					continue;
				}
				
				if(name.equals("F") || name.equals("f"))
				{
					String foodItem = "";
					String itemPrice = "";
					
					System.out.println("Enter customer name and food item");
					System.out.print("Customer Name: ");
					name = cin.nextLine();
					
					System.out.print("Food Item: ");
					foodItem = cin.nextLine();
					System.out.print("Item Price: ");
					itemPrice = cin.nextLine();
					if(Util.isAValidFloat(itemPrice))
					{
						
						boolean found = false;
						
						for(Customer tableCustomer : tables.get(intSelection - 1).getCustomers())
						{
							String tempName1 = tableCustomer.getFullName().trim().toUpperCase();
							if(tempName1.equals(name.trim().toUpperCase()))
							{
								tableCustomer.getFoodItems().add(new FoodItem(foodItem, Double.parseDouble(itemPrice)));
								found = true;
								break;
							}
						}
						if(!found)
						{
							System.out.println("Not a valid customer name");
						}
					}
					else
					{
						System.out.println("Enter a valid price for food item.");
						break;
					}
				}
				else
				{
					System.out.print("Enter customer name: ");
					name = cin.nextLine();
					
					Customer customer = new Customer(name);
					
					if(tables.get(intSelection - 1).getCustomers().size() == 0)
						tables.get(intSelection - 1).addCustomerToTable(new Customer(customer));
					else
					{
						boolean found = false;
						//throws ConcurrentModification Exception due to modifying the list size while in
						//the loop iterating over the list.
						for(Customer tableCustomer : tables.get(intSelection - 1).getCustomers())
						{
							String tempName1 = tableCustomer.getFullName().trim().toUpperCase();
							String tempName2 = customer.getFullName().trim().toUpperCase();
							if(!tempName1.equals(tempName2))
							{
								found = true;
								tables.get(intSelection - 1).addCustomerToTable(new Customer(customer));
								break;
							}
						}

					}//end else
				}//end F/f selection else statement
				
			}//end while loop 2
			
		}//end while loop 1
		
		System.out.println("Bye");
		cin.close();

	}//end main()

}//end class definition
