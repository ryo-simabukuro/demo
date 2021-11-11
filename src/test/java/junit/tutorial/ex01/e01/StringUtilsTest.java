package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

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
	void testToSnakeCase() {
		String result = StringUtils.toSnakeCase("aaa");
		assertEquals("aaa", result, "toSnakeCase(aaa) error");
	}
	@Test
	void testToSnakeCase2() {
		String result = StringUtils.toSnakeCase("HelloWorld");
		assertEquals("hello_world", result, "toSnakeCase(HelloWorld) error");
	}
	@Test
	void testToSnakeCase3() {
		String result = StringUtils.toSnakeCase("practiceJunit");
		assertEquals("practice_junit", result, "toSnakeCase(practiceJunit) error");
	}

}
