package net.javaguides.springmvc.dao;

import java.util.List;

import net.javaguides.springmvc.entity.Customer;

public interface CustomerDAO {

	// get list customer
	public List<Customer> getCustomers();

	// add customer
	public void saveCustomer(Customer theCustomer);

	// get information of each customer
	public Customer getCustomer(int theId);

	// delete customer
	public void deleteCustomer(int theId);
	
}