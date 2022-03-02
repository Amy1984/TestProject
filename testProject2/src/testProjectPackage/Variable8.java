package testProjectPackage;

public class Variable8 {
	
	int b = 10; //Global Variable	
	static int c = 5; //Static Variable

	public static void main(String[] args) {
		
		int a = 6; //Local Variable
		
		Variable8 v8 = new Variable8();
		
		System.out.println(v8.b); //10 - Calling a variable using Object Reference
		System.out.println(c);
		a();
	}
	
	public static void a() {
		int f = 15; //Local Variable
		System.out.println(f); //15
		System.out.println("Hello Selenium");
	}

}
