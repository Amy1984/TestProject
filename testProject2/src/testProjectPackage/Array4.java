package testProjectPackage;

public class Array4 {

	public static void main(String[] args) {
		
		// Definition of Multi Dimensional Array
		int a[][] = { {1,2,3,7}, {4,5,6,8}, {7,8,9,6} };
		
		// Total Rows
		int row = a.length; // Length is a property of an Array
		System.out.println("Total Rows : " + row); // 3
		
		// Total Columns
		int column = a[0].length;
		System.out.println("Total Columns : " + column); // 4
		
		// Print all Data from Multi Dimensional Array
		// Outer Loop
		for (int i = 0; i < row; i++) {
			
			// Inner Loop
			for (int j = 0; j < column; j++) {
				
				System.out.println(a[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
