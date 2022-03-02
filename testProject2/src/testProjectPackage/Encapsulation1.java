package testProjectPackage;

public class Encapsulation1 {
	
	// Later will change the scope of private to public
	private String name;
	
	public void setName(String a) {
		
		this.name = a;
	}
	
	// Changing variable scope from private to public
	public Object getName() {
		
		return name;
	}

}
