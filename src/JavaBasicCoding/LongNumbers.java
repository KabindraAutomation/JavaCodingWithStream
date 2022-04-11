package JavaBasicCoding;

public class LongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		what will be the output when you use a Lonhg Number with L and Without L Suffix? 
		
		long longNumberwithOutL = 1000*60*60*24*365;
		long longNumberwithtL = 1000*60*60*24*365L;
		System.out.println(longNumberwithOutL); //1471228928
		System.out.println(longNumberwithtL);   //31536000000
		//31536000000 = 36 bits
		//max limit of 32 bit int : 2147483647
		

	}

}
