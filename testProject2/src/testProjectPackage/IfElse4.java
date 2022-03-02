package testProjectPackage;

public class IfElse4 {

	public static void main(String[] args) {
		
		int age = 25; // Local Variable
		int weight = 50; // Local Variable
		
		// Outer If Block
		if (age > 18) {
			
			// Inner If Block
			if (weight > 50) {
				System.out.println("Eligible for blood donation");
			} else {
				System.out.println("Not Eligible");
			}
		}
		else {
			System.out.println("Age must be greater than 18 years");
		}
			
		}

	}
