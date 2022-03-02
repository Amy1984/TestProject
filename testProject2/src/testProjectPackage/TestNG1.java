package testProjectPackage;

import org.testng.annotations.*;

public class TestNG1 {
	
	@Test
	public void a2() {
		System.out.println("a2 test method");		
	}
	
	@BeforeTest
	public void b() {
		System.out.println("b method");
	}
	
	@BeforeSuite
	public void c() {
		System.out.println("c method");
	}
	
	@AfterMethod
	public void d() {
		System.out.println("d method");
	}
	
	@BeforeClass
	public void e() {
		System.out.println("e method");
	}
	
	@AfterTest
	public void f() {
		System.out.println("f method");
	}
	
	@AfterClass
	public void g() {
		System.out.println("g method");
	}
	
	@BeforeMethod
	public void h() {
		System.out.println("h method");
	}
	
	@AfterSuite
	public void i() {
		System.out.println("i method");
	}
	
	@Test
	public void a1() {
		System.out.println("a1 test method");
	}

}
