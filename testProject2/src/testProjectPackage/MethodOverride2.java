package testProjectPackage;

public class MethodOverride2 extends MethodOverride1 {
	
	public void eat() {
		System.out.println("You are Eating");
	}

	public static void main(String[] args) {
		
		MethodOverride2 mo2 = new MethodOverride2();
		mo2.eat();

	}

}
