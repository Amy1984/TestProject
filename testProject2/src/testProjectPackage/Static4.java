package testProjectPackage;

public class Static4 {

	public static void main(String[] args) {
		
		Static3 s3 = new Static3(1, "Ram");
		Static3 s4 = new Static3(2, "Shyam");
		Static3 s5 = new Static3(3, "Ruby");
		
		Static3.college = "NIMB";
		
		s3.getResult();
		s4.getResult();
		s5.getResult();

	}

}
