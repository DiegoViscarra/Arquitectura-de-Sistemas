package it.xpug.ocp.customerbase;

import java.util.ArrayList;
import java.util.List;

public class FinderFirstAndLastName implements Finder{
	public List<Customer> search(List<Customer> customers,Customer customer)
	{
		List<Customer> result = new ArrayList<Customer>();
		for (Customer ListCustomer : customers) {
			if (ListCustomer.firstName().equals(customer.firstName()) && ListCustomer.lastName().equals(customer.lastName()) ) {
				result.add(ListCustomer);
			}
		}
		return result;
	}
}
