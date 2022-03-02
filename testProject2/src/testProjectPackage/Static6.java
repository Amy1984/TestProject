package testProjectPackage;

public class Static6 {
	
	int x = 10; // Global Variable
	static int y = 5; // Static Variable
	
	// Non Static Method
	public void a() {
		
		int z = 10; // Local Variable
		System.out.println(z);
	}
	
	static int b = 6; // Static Variable
	
	// Static Method
	public static void b() {
		
		int a = 5; // Local Variable
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		// Here we are calling Non Static Method by the help of creating object reference of class
		Static6 s6 = new Static6();
		s6.a();
		
		// Here also we are calling Method but Static Method so we can directly call it because it is Static
		b();
		
		// Here we are printing b static variable in 3 ways below
		System.out.println(s6.b); // Not Appropriate Way
		System.out.println(Static6.b); // Appropriate Way
		System.out.println(b); // Correct Way

	}

}
