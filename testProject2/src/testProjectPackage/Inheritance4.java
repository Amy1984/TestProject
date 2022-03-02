package testProjectPackage;

public class Inheritance4 extends Inheritance3 {
	
	public void multiply(int x, int y) {
		
		z = x * y; // Establish Relation
		System.out.println("The multiplication is : " + z);
		
	}

	public static void main(String[] args) {
		
		int x = 20, y = 10;
		
		Inheritance4 i4 = new Inheritance4();
		
		i4.add(x, y);
		i4.add(20, 15);
		i4.substract(40, 18);
		i4.multiply(x, y);

	}

}
