package testProjectPackage;

public class UnaryOperator3 {

	public static void main(String[] args) {
		
		int a = 10; // Local Variable
		int b = 10; // Local Variable
		
		System.out.println(a++); // 10, 11
		
		System.out.println(a++ + ++a); // 11, 12, 13, 13
		
		System.out.println(b++ + ++b); // 10, 11, 12, 12
		
		System.out.println(b++ + b++); // 12, 13, 13, 14
		
		System.out.println(b); //14
		
		System.out.println(a++ + b++); // 13, 14, 14, 15
		
		int x = 2;
		int y = x++;
		
		System.out.println(y); // 2
		System.out.println(x); //3

	}

}
