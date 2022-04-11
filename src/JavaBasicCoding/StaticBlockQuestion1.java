package JavaBasicCoding;

public class StaticBlockQuestion1 {
	
	 //01. Explain static block in java?
			//can we have n numbers of static block? --> yes
			//Static block can return any where in java class?--Yes but it will execute in same squence
	
	static {
		System.out.println("Static block");
	}
	static {
		System.out.println("Static block2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Method");

	}

}
