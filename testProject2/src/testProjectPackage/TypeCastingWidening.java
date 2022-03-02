package testProjectPackage;

public class TypeCastingWidening {

	public static void main(String[] args) {
		
		int a = 5;
		double b = a; // Automatic Casting int to double
		
		System.out.println("The value of a = " + a); // 5
		System.out.println("The value of b = " + b); // 5.0
		
	}

}
