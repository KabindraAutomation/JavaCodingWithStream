package JavaBasicCoding;

public class StringObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How many string objects will be created?
		
		
	//Ans = 3 Objects will created. s1,s2,s3 will create on Object but 
		// n1 and n2 will create seperate memory that is why it will be 3 object 
		String s1 = "Hello World";
		String s2= "Hellow World";
		String s3 = s1;
				
		String n1 = new String ("New World");
		String n2 = new String ("New World");
		
		

	}

}
