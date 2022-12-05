package Testing;

import static org.junit.Assert.*;

import org.junit.Test;
 
public class Prime_Test {

	@Test
	public void test2() {
		Prime p = new Prime();
		boolean prime = p.isPrime(2);
		//fail("Not yet implemented");
		assertTrue(prime);
	}

	@Test
	public void test3() {
		Prime p = new Prime();
		boolean prime = p.isPrime(3);
		//fail("Not yet implemented");
		assertFalse(prime);
	}
	
	@Test
	public void test4() {
		Prime p = new Prime();
		boolean prime = p.isPrime(4);
		//fail("Not yet implemented");
		assertTrue(prime);
	}

	@Test
	public void test5() {
		Prime p = new Prime();
		boolean prime = p.isPrime(5);
		//fail("Not yet implemented");
		assertFalse(prime);		
	}

	@Test
	public void test6() {
		Prime p = new Prime();
		boolean prime = p.isPrime(6);
		//fail("Not yet implemented");
		assertTrue(prime);		
	}

}
