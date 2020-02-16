import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProgramTest {

	Fizzbuzz fizzbuzz = new Fizzbuzz();
	@Before
	public void setup() {
		fizzbuzz=new Fizzbuzz();
	}
	@Test
	public void test() {
		assertEquals("Deberia devolver FizzBuzz", fizzbuzz.generar(0),"FizzBuzz");
		assertEquals("Deberia devolver 1", fizzbuzz.generar(1),"1");
		assertEquals("Deberia devolver 2", fizzbuzz.generar(2),"2");
		assertEquals("Deberia devolver Fizz", fizzbuzz.generar(3),"Fizz");
		assertEquals("Deberia devolver 4", fizzbuzz.generar(4),"4");
		assertEquals("Deberia devolver Buzz", fizzbuzz.generar(5),"Buzz");
		assertEquals("Deberia devolver FizzBuzz", fizzbuzz.generar(15),"FizzBuzz");
	}
	@Test
	public void ComprobarMultiplosDe5() {	
		assertEquals(fizzbuzz.generar(5),"Buzz");
	}
}
