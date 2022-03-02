package testProjectPackage;

public class RelationalOperator1 {

	public static void main(String[] args) {
		
		int a = 300; // Local Variable
		int b = 300; // Local Variable
		
		if (a != b) {
			System.out.println("a is not equal to b");
		} else {
			System.out.println("a and b are equal");
		}
		
		String p = "HeLlo SEleniUm";
		String q = "Hello Selenium";
		
		// String Comparison - 1st way is not correct
		// We always use == for number comparison
		
		if (p == q) {
			System.out.println("p and q are equal for 1st way");
		} else {
			System.out.println("p and q are not equal for 1st way");
		}
		
		// String Comparison - 2nd way is not appropriate
		
		if (p.equals(q)) {
			System.out.println("p and q are equal for 2nd way");
		} else {
			System.out.println("p and q are not equal for 2nd way");
		}
		
		// String Comparison - 3rd way is correct
		if (p.equalsIgnoreCase(q)) {
			System.out.println("p and q are equal for 3rd way");
		} else {
			System.out.println("p and q are not equal for 3rd way");
		}

	}

}
