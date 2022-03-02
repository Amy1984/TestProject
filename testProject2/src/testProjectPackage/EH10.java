package testProjectPackage;

public class EH10 {
	
	public static void checkEligibility(int age) {
		
		try {
			if (age < 18) {
				throw new ArithmeticException("Invalid");
			} else {
				System.out.println("Valid");
			}
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) throws InterruptedException, Exception, ArithmeticException {
		
		Thread.sleep(3000);
		checkEligibility(15);
		checkEligibility(19);

	}

}
