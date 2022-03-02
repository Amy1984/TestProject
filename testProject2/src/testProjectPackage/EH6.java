package testProjectPackage;

public class EH6 {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		try {
			a[10] = 50;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Exception Handled");

	}

}
