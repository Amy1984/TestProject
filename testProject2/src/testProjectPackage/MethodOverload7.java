package testProjectPackage;

public class MethodOverload7 {
	
	public void sum(int a, long b) {
		System.out.println(a + b);
	}
	
	public void sum(long a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		
		MethodOverload7 mo7 = new MethodOverload7();
		
		//mo7.sum(20, 20); // Ambiguity Issue

	}

}
