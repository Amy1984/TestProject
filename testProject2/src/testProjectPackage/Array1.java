package testProjectPackage;

public class Array1 {

	public static void main(String[] args) {
		
		// Declairation of an Array and Instantiation
		int a[] = new int[5];
		
		// Print default value of an Array
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
		}
		
		// Initialization of an Array
		a[0] = 65;
		a[3] = 10;
		a[1] = 89;
		a[2] = 3;
		a[4] = 1;
		// a[5] = 6; Error :- java.lang.IndexOutOfBoundsException
		
		System.out.println(a[2]);
		
		// Print the length of an Array
		System.out.println("Total Array Length : " + a.length); // Length is the property of an Array
		
		// Print all Array Elements
		for (int i = 0; i < a.length; i++) {
			
			System.out.println("Array Value for Index :" + i + " is " + a[i]);
		}

	}

}
