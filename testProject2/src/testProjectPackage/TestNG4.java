package testProjectPackage;

import org.testng.annotations.Test;

public class TestNG4 {
	
	@Test(priority = -10)
	public void a() {
		System.out.println("a test method");
	}
	
	@Test(priority = -20)
	public void b() {
		System.out.println("b test method");
	}
	
	@Test(priority = 0)
	public void z() {
		System.out.println("z test method");
	}
	
	@Test(priority = 2)
	public void d() {
		System.out.println("d test method");
	}
	
	@Test
	public void a3() {
		System.out.println("a3 test method");
	}
	
	@Test
	public void e() {
		System.out.println("e test method");
	}
	
	@Test
	public void s() {
		System.out.println("s test method");
	}
	
	@Test(priority = 1)
	public void f() {
		System.out.println("f test method");
	}

}
