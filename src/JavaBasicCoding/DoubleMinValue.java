package JavaBasicCoding;

public class DoubleMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * what is the value of double MIN Value? 
		 * which one is bigger --> double MIN_VALUE or 0.0d ?
		 * which one is bigger --> double MIN_ VALUE or Negative_Infinity?
		 * 
		 */
		
		
		System.out.println(Double.MIN_VALUE); // is a +ve number
		System.out.println(Long.MIN_VALUE); // is a -Ve number
		System.out.println(Integer.MIN_VALUE);  // is a -Ve number
		
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		System.out.println(Math.min(Integer.MIN_VALUE, 0.0d));  // - ve number
		System.out.println(Math.min(Float.MIN_VALUE, 0.0f));
		
		
		System.out.println(Float.MIN_VALUE); // is a +ve number
		
		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));
	}
	

}
