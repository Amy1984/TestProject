package testProjectPackage;

public class ParameterizedConstructor {
	
	int id; // Global Variable
	String name; // Global Variable
	String address; // Global Variable
	
	// Default Constructor
	ParameterizedConstructor() {
		System.out.println("Hello Default Constructor");
	}
	
	// Parameterized Constructor
	ParameterizedConstructor(int a, String b, String c) {
		id = a;
		name = b;
		address = c;
	}
	
	// Non Static Method
	public void displayInfo() {
		System.out.println(id + " " + name + " " + address);
	}

	public static void main(String[] args) {
		
		// Default Constructor Calling
		ParameterizedConstructor pc = new ParameterizedConstructor();
		
		// Parameterized Constructor Calling
		ParameterizedConstructor pc1 = new ParameterizedConstructor(1, "Ram", "Pune");
		ParameterizedConstructor pc2 = new ParameterizedConstructor(2, "Shyam", "Pune");
		
		pc.displayInfo();
		pc1.displayInfo();
		pc2.displayInfo();

	}

}
