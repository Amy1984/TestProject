package testProjectPackage;

public class Array2 {

	public static void main(String[] args) {
		
		// We can write an Array in below fashion as well
		Object a[] = {1,2,3,4,5, "Selenium", 5, 6.0}; // Definition of an Object Array
		
		int b[] = {1,2,3,4,5}; // Definition of an Integer Array
		
		String s[] = {"Hi","Hello"}; // Definition of an String Array
		
		System.out.println(a.length); // 8
		System.out.println(b.length); // 5
		System.out.println(s.length); // 2
		
		System.out.println(a[5]); // Selenium
		System.out.println(b[4]); // 5
		System.out.println(s[1]); // Hello
		
		a[5] = "Automation"; // Modifying Array Value using Index
		System.out.println(a[5]); // Automation

	}

}
