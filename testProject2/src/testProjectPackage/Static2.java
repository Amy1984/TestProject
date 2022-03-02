package testProjectPackage;

public class Static2 {
	
	int roll; // Global Variable
	String name; // Global Variable
	String college; // Global Variable

	public static void main(String[] args) {
		
		Static2 s2 = new Static2();
		
		System.out.println(s2.roll); // 0
		System.out.println(s2.name); // null
		System.out.println(s2.college); // null

	}

}
