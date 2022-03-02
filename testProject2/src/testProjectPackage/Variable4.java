package testProjectPackage;

public class Variable4 {

	public static void main(String[] args) {
		
		int a[] = {1, 2, 3, 4, 5, 6, 100}; // Int Array
		
		String b[] = {"Ram" , "Shyam"}; //  String Array
		
		System.out.println(b[0]); //Ram
		System.out.println(a[3]); //4
		System.out.println(a[0]); //1
		System.out.println(a[6]); //100
		System.out.println(a[1]); //2
		System.out.println(a[2]); //3
		System.out.println(a[4]); //5
		System.out.println(a[5]); //6
		System.out.println(b[1]); //Shyam
		
		Object c[] = {1, 2, 3, "Ram", "Shyam", 'a'};
		
		System.out.println(c[3]); //Ram
		System.out.println(c[0]); //1
		System.out.println(c[5]); //a
		
		System.out.println(a[7]);
		; // ArrayIndexoutofBoundException
	}

}
