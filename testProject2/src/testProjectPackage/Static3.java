package testProjectPackage;

public class Static3 {
	
	int roll; // Global Variable
	String name; // Global Variable
	static String college = "Balaji"; // Static Variable
	
	Static3 (int r, String n) {
		
		roll = r;
		name = n;
	}
	
	public void getResult() {
		
		System.out.println(roll + " " + name + " " + college);
	}

}
