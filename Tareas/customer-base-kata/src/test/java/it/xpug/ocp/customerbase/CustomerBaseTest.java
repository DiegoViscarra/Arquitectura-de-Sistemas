package it.xpug.ocp.customerbase;

import static java.util.Arrays.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;


public class CustomerBaseTest {

	private Customer alice = new Customer("Alice", "Rossi", 10000);
	private Customer bob = new Customer("Bob", "Rossi", 20000);
	private Customer charlie = new Customer("Charlie", "Bianchi", 30000);

	private CustomerBase customerBase = new CustomerBase();

	@Before
	public void setUp() throws Exception {
		customerBase.add(alice);
		customerBase.add(bob);
		customerBase.add(charlie);
	}

	@Test
	public void findByLastName() throws Exception {
		Customer search = new Customer("Alice", "Rossi", 10000);
		List<Customer> found = customerBase.FindCustomers(search, 1);
		assertThat(found, is(asList(alice, bob)));
	}

	@Test
	public void findByFirstAndLastName() throws Exception {
		Customer search = new Customer("Alice", "Rossi", 10000);
		List<Customer> found = customerBase.FindCustomers(search, 2);
		assertThat(found, is(asList(alice)));
	}

	@Test
	public void findWithCreditGreaterThan() throws Exception {
		Customer search = new Customer("", "", 20000);
		List<Customer> found = customerBase.FindCustomers(search, 3);
		assertThat(found, is(asList(charlie)));
	}

	@Test
	public void findWithCreditLessThan() throws Exception {
		Customer search = new Customer("", "", 20000);
		List<Customer> found = customerBase.FindCustomers(search, 4);
		assertThat(found, is(asList(alice)));

	}

}
