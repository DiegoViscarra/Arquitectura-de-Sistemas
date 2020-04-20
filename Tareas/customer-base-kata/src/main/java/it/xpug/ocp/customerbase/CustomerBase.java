package it.xpug.ocp.customerbase;
import java.util.*;


public class CustomerBase {

	public List<Customer> customers = new ArrayList<Customer>();
	public void add(Customer customer) {
		customers.add(customer);
	}
	
	public List<Customer> FindCustomers(Customer customer, int SearchType){
		List<Customer> result = new ArrayList<Customer>();
		Finder find= FindTypeSearch(SearchType);
		result= find.search(customers, customer);
		return result;
	}

	private Finder FindTypeSearch(int searchType) {
		Finder type = null;
		switch(searchType) {
		case 1:
			type= new FinderLastName();
			break;
		case 2:
			type= new FinderFirstAndLastName();
			break;
		case 3:
			type= new FinderCreditGreaterThan();
			break;
		case 4:
			type= new FinderCreditLessThan();
			break;
		}
		return type;
	}
}
