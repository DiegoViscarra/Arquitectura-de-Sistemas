package it.xpug.ocp.customerbase;

import java.util.List;

public interface Finder {
	
	public List<Customer> search(List<Customer> customers,Customer customer);
	
}
