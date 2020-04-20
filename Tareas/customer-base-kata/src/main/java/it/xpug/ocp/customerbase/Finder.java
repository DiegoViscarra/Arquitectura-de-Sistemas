package it.xpug.ocp.customerbase;

import java.util.ArrayList;
import java.util.List;

public class Finder {
	
	public List<Customer> findByLastName(String lastName)
	{
		List<Customer> result = new ArrayList<Customer>();
		List<Customer> customers = new ArrayList<Customer>();
		CustomerBase customerBase = new CustomerBase();
		customers=customerBase.GetList();
		for (Customer customer : customers) {
			if (customer.lastName().equals(lastName)) {
				result.add(customer);
			}
		}
		return result;
	}
	
	public List<Customer> findByFirstAndLastName(String firstName, String lastName)
	{
		List<Customer> result = new ArrayList<Customer>();
		List<Customer> customers = new ArrayList<Customer>();
		CustomerBase customerBase = new CustomerBase();
		customers=customerBase.GetList();
		for (Customer customer : customers) {
			if (customer.firstName().equals(firstName) && customer.lastName().equals(lastName) ) {
				result.add(customer);
			}
		}
		return result;
	}
	
	public List<Customer> findByCreditGreaterThan(int credit)
	{
		List<Customer> result = new ArrayList<Customer>();
		List<Customer> customers = new ArrayList<Customer>();
		CustomerBase customerBase = new CustomerBase();
		customers=customerBase.GetList();
		for (Customer customer : customers) {
			if (customer.credit() > credit) {
				result.add(customer);
			}
		}
		return result;
	}
	
	public List<Customer> findWithCreditLessThan(int credit)
	{
		List<Customer> result = new ArrayList<Customer>();
		List<Customer> customers = new ArrayList<Customer>();
		CustomerBase customerBase = new CustomerBase();
		customers=customerBase.GetList();
		for (Customer customer : customers) {
			if (customer.credit() < credit) {
				result.add(customer);
			}
		}
		return result;
	}
	
}
