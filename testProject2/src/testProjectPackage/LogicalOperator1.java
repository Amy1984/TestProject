package testProjectPackage;

public class LogicalOperator1 {

	public static void main(String[] args) {
	
		int a = 10; // local variable
		int b = 5; // local variable
		int c = 20; // local variable
		
		// Logical Operator
		System.out.println(a < b && a < c); //False
		
		// Bitwise Operator
		System.out.println(a < b & a < c); //False & True = False

	}

}
