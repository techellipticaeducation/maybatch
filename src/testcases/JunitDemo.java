package testcases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitDemo {

	@BeforeClass
	public static void m5() {
		System.out.println("before class");
	}
	
	@AfterClass
	public  static void m6() {
		System.out.println("after class");
	}
	
	@Before
	public void m1() {
		System.out.println("before test");
	}
	
	@After
	public void m2() {
		System.out.println("after test");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
}
