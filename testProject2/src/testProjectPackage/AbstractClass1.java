package testProjectPackage;

public abstract class AbstractClass1 {

	static int a = 5; // Static Variable
	int b = 5;
	final int c = 10;

	// Default Constructor
	AbstractClass1() {
		System.out.println("Hello Abstract Class Constructor");
	}

	// Abstract Method
	abstract void eat();

	// Non-Abstract Method
	public void a() {
		System.out.println("Hello Non-Abstract Method");
	}

}
