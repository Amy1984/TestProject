package testProjectPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG5 {

	// @Test
	public void a() {
		System.out.println("a test method");
	}

	// Industry mostly use - recommended
	@Test(enabled = false)
	public void b() {
		System.out.println("b test method");
	}

	// Test Case will execute 2 times
	@Test(invocationCount = 2)
	public void c() {
		System.out.println("c test method");
	}

	// Test Case will execute 0 times, Means Test Case is Skipped
	@Test(invocationCount = 0)
	public void d() {
		System.out.println("d test method");
	}

	// Correct way but not recommended
	@Test
	public void e() {
		System.out.println("e test method");
		throw new SkipException("Skipping e method");
	}

}
