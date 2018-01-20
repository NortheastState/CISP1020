/**
 * -------------------------------------------------
 * File name: Table.java
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
 * <b>Enter purpose</b>
 * <hr>
 * Date created: Jan 18, 2018
 * <hr>
 * @author David Blair
 */
public class Table
{
	private int tableID;
	private ArrayList<Customer> customers;
	
	public Table(int tableID)
	{
		this.tableID = tableID;
		customers = new ArrayList<Customer>();
	}
	
	public Table(Table table)
	{
		this.tableID = table.tableID;
		customers = new ArrayList<Customer>();
		for(Customer customer : table.customers)
		{
			customers.add(customer);
		}
	}

	public int getTableID()
	{
		return tableID;
	}

	public void addCustomerToTable(Customer customer)
	{
		customers.add(customer);
	}
	
	public ArrayList<Customer> getCustomers()
	{
		return customers;
	}
	
	public double calculateTableBill()
	{
		double totalTableBill = 0.0;
		for(Customer customer : customers)
		{
			totalTableBill += customer.calculateBill();
		}
		return totalTableBill;
	}
}
