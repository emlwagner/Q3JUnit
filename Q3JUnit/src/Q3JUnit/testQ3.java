package Q3JUnit;

import static org.junit.Assert.*;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import MainPackage.MyClass;

public class testQ3 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddTwoNumbers() {
		int answer = 11;
		assertEquals("The method does not properly add two numbers.", answer, MyClass.AddTwoNumbers(7, 4));
	}
	
	@Test
	public void testReturnTrue() {
		assertTrue("The method does not return true", MyClass.ReturnTrue());
	}

}
