package org.factoriaf5.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FizzbuzzApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testFizzBuzz() {
		int a = 15;

		String result = FizzbuzzApplication.fizzBuzz(a);
		
		assertEquals(result, "FizzBuzz");
	}

	@Test
	public void testFizzBuzzCero() {
		int a = 0;

		String result = FizzbuzzApplication.fizzBuzz(a);
		
		assertEquals(result, "FizzBuzz");
	}

	@Test
	public void testFizzBuzzNegative() {
		int a = -1;

		String result = FizzbuzzApplication.fizzBuzz(a);
		
		assertEquals(result, "-1");

	}

	@Test
	public void testFizz() {
		int a = 3;

		String result = FizzbuzzApplication.fizzBuzz(a);
		
		assertEquals(result, "Fizz");
	}

	@Test
	public void testBuzz() {
		int a = 25;

		String result = FizzbuzzApplication.fizzBuzz(a);
		
		assertEquals(result, "Buzz");
	}

	@Test
	public void testFizzBuzzContains35() {
		int a = 35;

		String result = FizzbuzzApplication.fizzBuzz(a);
		
		assertEquals(result, "FizzBuzz");
	}

	@Test
	public void testFizzBuzzContains3() {
		int a = 13;

		String result = FizzbuzzApplication.fizzBuzz(a);
		
		assertEquals(result, "Fizz");
	}
	@Test
	public void testFizzBuzzContains5() {
		int a = 52;

		String result = FizzbuzzApplication.fizzBuzz(a);
		
		assertEquals(result, "Buzz");
	}


}
