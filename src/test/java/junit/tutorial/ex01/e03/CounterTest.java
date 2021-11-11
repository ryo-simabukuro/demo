package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCounter() {
		Counter counter =new Counter();
		int result = counter.increment();
		assertEquals(1, result, "error");
	}
	
	@Test
	void testCounter2() {
		Counter counter =new Counter();
		int result = counter.increment();
		result=counter.increment();
		assertEquals(2, result, "error");
	}
	
	@Test
	void testCounter3() {
		Counter counter =new Counter();
		int result =0;
		for(int i=1; i<=50; i++) {
			result=counter.increment();
		}
		result=counter.increment();
		
		
		assertEquals(51, result, "error");
	}


}
