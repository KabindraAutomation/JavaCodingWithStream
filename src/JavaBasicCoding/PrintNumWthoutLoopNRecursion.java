package JavaBasicCoding;

import java.util.Arrays;
import java.util.BitSet;

public class PrintNumWthoutLoopNRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Solution for that question 
		//1. Array fill:
		
		 Object num[] = new Object[100];
		 Arrays.fill(num, new Object() {
			 int count = 0;
			 @Override
			 public String toString() {
				 
				 return Integer.toString(++count);
			 }
		 });
			 
			 
		 System.out.println(Arrays.toString(num));
		 
		 
		 
		 
		//2. Bit Set method:
		
		//2 Bit Set Method
		//new BitSet() {{(1,101);}}
		
		
		
	}

}
