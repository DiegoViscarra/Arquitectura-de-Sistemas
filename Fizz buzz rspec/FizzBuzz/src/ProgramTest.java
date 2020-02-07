import static org.junit.Assert.*;

import org.junit.Test;

public class ProgramTest {

	@Test
	public void test() {
		Fizzbuzz test= new Fizzbuzz();
		assertEquals("Deberia devolver FizzBuzz", test.generarPara(0),"FizzBuzz");
		assertEquals("Deberia devolver 1", test.generarPara(1),"1");
		assertEquals("Deberia devolver 2", test.generarPara(2),"2");
		assertEquals("Deberia devolver Fizz", test.generarPara(3),"Fizz");
		assertEquals("Deberia devolver 4", test.generarPara(4),"4");
		assertEquals("Deberia devolver Buzz", test.generarPara(5),"Buzz");
		assertEquals("Deberia devolver FizzBuzz", test.generarPara(15),"FizzBuzz");
	}
}
