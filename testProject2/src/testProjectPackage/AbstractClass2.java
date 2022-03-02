package testProjectPackage;

public class AbstractClass2 extends AbstractClass1{

	void eat() {
		System.out.println("Eating");
	}

	public static void main(String[] args) {
		
		// We can not create an object of Abstract Class and Interface
		AbstractClass2 ac2 = new AbstractClass2();
		ac2.eat();
		ac2.a();
				
	}

}
