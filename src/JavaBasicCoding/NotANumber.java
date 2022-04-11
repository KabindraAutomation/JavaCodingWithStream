package JavaBasicCoding;

public class NotANumber {

	public static void main(String[] args) {
//		// What is Nan - Not a Number?
//		How is Nan defined in different language?
//				java,c,c++ Ruby, Python JavaScript
		
		// System.out.println(2/0); //Output = java.lang.ArithmeticException: / by zero
		// System.out.println(2.0/0.0); //output = Infinity
		System.out.println(0.0/0.0); // Output = NaN
		System.out.println(Math.sqrt(-1)); // Output = Nan
		
		
		System.out.println(Float.NaN == Float.NaN); // Output =false
		System.out.println(Float.NaN != Float.NaN); // Output =true
		
		double nan = 2.1 %0;
		System.out.println((2.1% 0) == nan);
		System.out.println(nan == nan);

	}

}
