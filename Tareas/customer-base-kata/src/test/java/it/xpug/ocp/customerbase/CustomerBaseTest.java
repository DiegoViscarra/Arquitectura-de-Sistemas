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
	private Finder find=new Finder();

	@Before
	public void setUp() throws Exception {
		customerBase.add(alice);
		customerBase.add(bob);
		customerBase.add(charlie);
	}

	@Test
	public void findByLastName() throws Exception {
		List<Customer> found = find.findByLastName("Rossi");
		assertThat(found, is(asList(alice, bob)));
	}

	@Test
	public void findByFirstAndLastName() throws Exception {
		List<Customer> found = find.findByFirstAndLastName("Alice", "Rossi");
		assertThat(found, is(asList(alice)));
	}

	@Test
	public void findWithCreditGreaterThan() throws Exception {
		List<Customer> found = find.findByCreditGreaterThan(20000);
		assertThat(found, is(asList(charlie)));
	}

	@Test
	public void findWithCreditLessThan() throws Exception {
		List<Customer> found = find.findWithCreditLessThan(20000);
		assertThat(found, is(asList(alice)));

	}


}
