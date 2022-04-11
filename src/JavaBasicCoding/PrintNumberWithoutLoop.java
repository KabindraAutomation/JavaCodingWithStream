package JavaBasicCoding;

import java.util.stream.IntStream;

public class PrintNumberWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print 1 to 100 without using loop

		// There are two: 1. recursive function and 2. java Stream

		// printNum(1);
		//printNum(8, 25);
		
		IntStream.range(1, 101).forEach(e->System.out.println(e));

	}

	/*
	 * public static void printNum(int num) {
	 * 
	 * if (num <= 100) {
	 * 
	 * System.out.println(num);// 1,2,3,4................100 num++; printNum(num);
	 * 
	 * }
	 * 
	 * }
	 */
     

//	public static void printNum(int start, int end) {
//
//		if (start <= end) {
//
//			System.out.println(start);// 1,2,3,4................100
//			start++;
//			printNum(start, end);
//
//		}
//
//	}
	
}