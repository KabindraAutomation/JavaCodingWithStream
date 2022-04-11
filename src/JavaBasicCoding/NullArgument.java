package JavaBasicCoding;

public class NullArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Pass null argument with method overloading with String and Object types
		test(null);
		
	}
	public static void test(Object o) {
		System.out.println("Object Argument");
		
	}
	public static void test(String s) {
		
		System.out.println("String Argument");
		
	}
//	public static void test(StringBuilder s) {
//		
//		System.out.println("String Argument");
//		
//	}

}
