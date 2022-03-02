package testProjectPackage;

public class Interface5 extends Inheritance1 implements Interface3, Interface4{
	
	public void b() {
		System.out.println("b method");
	}
	
	public void a() {
		System.out.println("a method");
	}

	public static void main(String[] args) {
		
		Interface5 if5 = new Interface5();
		if5.a();
		if5.b();
		System.out.println(if5.roll); // roll is inherited from Inheritance1

	}

}
