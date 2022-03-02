package testProjectPackage;

public class TestClass {
	
	int a = 5; //Global Variable
	static int c = 10; //Static Variable

	public static void main(String[] args) {
	
		System.out.println("Hello Automation test engineer");
		System.out.println("12345");
		System.out.println("Hello Selenium");
		System.out.println("1234567890");
		System.out.println("Hello Java");
		aMethod();
		bMethod();

	}
	
	public static void aMethod() {
		
		System.out.println("A Method");
	}
	
	public static void bMethod() {
		
		System.out.println("B Method");
		
		int b = 4; //Local Variable
	}

}
