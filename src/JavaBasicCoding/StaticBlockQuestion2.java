package JavaBasicCoding;

public class StaticBlockQuestion2 {
	// 02. How ca we run a java program without making any object?
	 //* 03. similarity and Difference between Static block and Static method?

	static {
		System.out.println("Static block");

	}

	public static void test() {

		System.out.println("testing method");
	}
	public static void Cover() {
		
		System.out.println("Conver Method");
	}

	public static void main(String a[]) {
		System.out.println("Main Method");
		test();
		Cover(); 
	}
}