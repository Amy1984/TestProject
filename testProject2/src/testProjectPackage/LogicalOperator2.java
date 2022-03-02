package testProjectPackage;

public class LogicalOperator2 {

	public static void main(String[] args) {
		
		int a = 10; // local variable
		int b = 5; // local variable
		int c = 20; // local variable
		
		// Logical Operator
		System.out.println(a < b && a++ < c); //False
		System.out.println(a); //10
		
		// Bitwise Operator
		System.out.println(a < b & a++ < c); //False & True = False
		System.out.println(a); //11

	}

}
