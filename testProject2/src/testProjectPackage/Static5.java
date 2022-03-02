package testProjectPackage;

public class Static5 {
	
	static int z = 5; //Static Variable
	int y = 1; // Global Variable
	
	// Static Method
	public static void a() {
		
		z = 10; // Local Variable
		System.out.println(z);
	}
	
	// Non Static Method
	public void b() {
		
		z = 15; // Local Variable
		System.out.println(z);
		a();
	}

	public static void main(String[] args) {
		
		a();
		Static5 s5 = new Static5();
		s5.b();

	}

}
