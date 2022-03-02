package testProjectPackage;

public class MethodOverride7 {

	public static void main(String[] args) {
		
		// Assign parent class ref to child class object - Dynamic method dispatch
		MethodOverride5 mo5 = new MethodOverride6();
		
		mo5.cook();
		mo5.eat();
		mo5.handWash();
		//mo5.angry();

	}

}
