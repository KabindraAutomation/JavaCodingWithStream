package JavaBasicCoding;

public class StaticBlockQuestion6 {
	
	
	/*06. Can we Initialize member variables within Static Block? 
	 * Any= yes we can inilialize member variable within static block.	*/
	String name;
	static int age;
	static {
		StaticBlockQuestion6 e1= new StaticBlockQuestion6();
		
		e1.name = "Kabin";
		age = 25;
		System.out.println(e1.name + " "+ age);
	}
	
	public static void main(String a[]) {
		
		
	}

}
